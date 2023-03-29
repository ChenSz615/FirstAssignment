import java.util.*;
class animal{
    String name;
    double height;
    int weight;
    int velocity;

    void show(){
        System.out.println(this.name);
        System.out.println(this.height);
        System.out.println(this.weight);
        System.out.println(this.velocity);
    }
    double distance1(int x,double y){

        return x*y*this.velocity;
    
    }
    double distance2(int x){
       
        return x*this.velocity;
    }
}
public class A1113322_0324_1{
    public static void main(String[] args) {
        animal[] Animal= new animal[4]; 
        for(int i=0;i<4;i++){
            Animal[i]= new animal();
        }
        Animal[0].name="雪寶";
        Animal[0].height=1.1;
        Animal[0].weight=52;
        Animal[0].velocity=100;
        Animal[1].name="驢子";
        Animal[1].height=1.5;
        Animal[1].weight=99;
        Animal[1].velocity=200;
        Animal[2].name="安那";
        Animal[2].height=1.7;
        Animal[2].weight=48;
        Animal[2].velocity=120;
        Animal[3].name="愛沙";
        Animal[3].height=1.7;
        Animal[3].weight=50;
        Animal[3].velocity=120;
        for(int i=0;i<4;i++){
            Animal[i].show();
        }
        for(int i=0;i<4;i++){
            System.out.print("請輸入x值及y值:");
            Scanner sc = new Scanner(System.in);
            int x=sc.nextInt();
            double y=sc.nextDouble();
            if(y==0){
    
                System.out.println("奔跑距離為:"+Animal[i].distance2(x));
            }
            else{
                
                System.out.println("奔跑距離為:"+Animal[i].distance1(x,y));
            }

        }
    }
    


    
}