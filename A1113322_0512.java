import java.util.*;

class Time extends Thread {
    private static final int MIN_ORDER = 10;
    private static final int MAX_ORDER = 50;
    private static final int WAIT_TIME = 3000;

    private Order e;

    public Time(Order e) {
        this.e = e;
    }

    @Override
    public void run() {
        Random rand = new Random();
        while (true) {
            synchronized (e) {
                if (e.pork <= 0 && e.beef <= 0 && e.vegetable <= 0) {
                    System.out.println("水餃全部售完");
                    System.exit(0);
                }

                int orderAmount = rand.nextInt(MAX_ORDER - MIN_ORDER + 1) + MIN_ORDER;
                int orderType = rand.nextInt(3);

                String type;
                int remainingStock;

                switch (orderType) {
                    case 0:
                        type = "豬肉水餃";
                        remainingStock = e.pork;
                        break;
                    case 1:
                        type = "牛肉水餃";
                        remainingStock = e.beef;
                        break;
                    case 2:
                        type = "蔬菜水餃";
                        remainingStock = e.vegetable;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid order type");
                }

                if (remainingStock <= 0) {
                    System.out.println(type + "售完, 請重新點餐");
                    continue;
                }

                System.out.println("顧客點餐: " + orderAmount + "顆" + type);

                // 更新水餃庫存
                switch (orderType) {
                    case 0:
                        e.pork -= orderAmount;
                        break;
                    case 1:
                        e.beef -= orderAmount;
                        break;
                    case 2:
                        e.vegetable -= orderAmount;
                        break;
                }

                try {
                    Thread.sleep(WAIT_TIME); // 等待下一位顧客點餐
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

class Order {
    int num, type, amount;
    int pork = 5000;
    int beef = 3000;
    int vegetable = 1000;

    public Order(int num, int type, int amount) {
        this.num = num;
        this.type = type;
        this.amount = amount;
    }
}

public class  A1113322_0512{
    public static void main(String[] argv) {
        int number;
        System.out.print("請輸入顧客數目:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        Order order = new Order(number, 0, 0);
        Time time = new Time(order);

        time.start();
        
    }
}
