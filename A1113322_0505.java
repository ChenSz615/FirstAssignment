import java.util.*;
public class A1113322_0505 {
    public static void main(String [] argv) {
        int array[] ={2,4,17,28,32,39};
        int count=0;
        int a=0,b=0,c=0,d=0,e=0,f=0;
        try{ 
            System.out.print("請輸入六個整數(1~49,勿輸入重複值):");
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            e=sc.nextInt();
            f=sc.nextInt();
            if(a<1 || a>49|| b<1|| b>49 || c<1 || c>49 || d<1 || d>49 || e<1 || e>49 || f<1 || f>49 ){
                throw new IllegalArgumentException("你輸入的值不介於1~49之間!");
            }
            for(int i=0;i<6;i++){
                if(array[i]==a|| array[i]==b || array[i]==c || array[i]==d || array[i]==e || array[i]==f){
                    count++;
                }
            }
            System.out.println("中獎"+count+"碼!");
        }catch( IllegalArgumentException ex){
            System.out.println(ex);
        }
        
    }
}
