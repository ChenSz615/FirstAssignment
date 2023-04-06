import java.util.*;
class animal{
    String name;
    double height;
    int weight;
    int velocity;
    animal(String x,double y,int z,int v){
        name=x;
        height=y;
        weight=z;
        velocity=v;
    }

    void show(){
        System.out.print("姓名:"+name+" ");
        System.out.print("身高:"+height+"公尺 ");
        System.out.print("體重:"+weight+"公斤 ");
        System.out.print("速度:"+velocity+" 公尺/分鐘");
    }
    double distance1(int x){
        return x*velocity;
    }
    double distance2(int x ,double y){
        return x*y*velocity;
    }
    static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class human extends animal{
    String gender;
    human(String x,Double y,int z,int v,String gender){
        super(x,y,z,v);
        this.gender=gender;
    }
    void show(){
        System.out.print("姓名:"+name+" ");
        System.out.print("身高:"+height+"公尺 ");
        System.out.print("體重:"+weight+"公斤 ");
        System.out.print("速度:"+velocity+" 公尺/分鐘");
        System.out.println("性別為:"+ gender);
    }
}
class snow extends human{
    String ice;
    snow(String x,Double y,int z,int v,String g,String ice){
        super(x,y,z,v,g);
        this.ice=ice;
    }
    void show(){
        System.out.print("姓名:"+name+" ");
        System.out.print("身高:"+height+"公尺 ");
        System.out.print("體重:"+weight+"公斤 ");
        System.out.print("速度:"+velocity+" 公尺/分鐘");
        System.out.println("性別為:"+ gender);
        System.out.println("是否具冰凍技能:"+ice);
    }
    double distance1(int x){
        return 2*x*velocity;
    }
    double distance2(int x ,double y){
        return 2*x*y*velocity;
    }
}
public class A1113322_0331{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        animal.showinfo();
        animal a= new animal("雪寶",1.1,52,100);
        System.out.print("請輸入x及y值:");
        int ax=sc.nextInt();
        double ay= sc.nextDouble();
        if(ay==0){
            System.out.println("奔跑速度為:"+a.distance1(ax)); 
        }else{
            System.out.println("奔跑速度為:"+ a.distance2(ax,ay));
        }   

        animal b= new animal("驢子",1.5,99,200);  
        System.out.print("請輸入x及y值:");
        int bx=sc.nextInt();
        double by= sc.nextDouble();
        if(by==0){
            System.out.println("奔跑速度為:"+b.distance1(bx)); 
        }else{
            System.out.println("奔跑速度為:"+ b.distance2(bx,by));
        } 

        human c= new human("阿克",1.9,80,150,"男");
        System.out.print("請輸入x及y值:");
        int cx=sc.nextInt();
        double cy= sc.nextDouble();
        if(cy==0){
            System.out.println("奔跑速度為:"+c.distance1(cx)); 
        }else{
            System.out.println("奔跑速度為:"+ c.distance2(cx,cy));
        } 

        human d= new human("漢斯",1.8,78,130,"男");
        System.out.print("請輸入x及y值:");
        int dx =sc.nextInt();
        double dy= sc.nextDouble();
        if(dy==0){
            System.out.println("奔跑速度為:"+d.distance1(dx)); 
        }else{
            System.out.println("奔跑速度為:"+ d.distance2(dx,dy));
        } 

        human e= new human("安那",1.7,48,120,"女");
        System.out.print("請輸入x及y值:");
        int ex=sc.nextInt();
        double ey= sc.nextDouble();
        if(ey==0){
            System.out.println("奔跑速度為:"+e.distance1(ex)); 
        }else{
            System.out.println("奔跑速度為:"+ e.distance2(ex,ey));
        } 

        snow f= new snow("愛沙",1.7,50,120,"女","YES");
        System.out.print("請輸入x及y值:");
        int fx=sc.nextInt();
        double fy= sc.nextDouble();
        if(fy==0){
            System.out.println("奔跑速度為:"+f.distance1(fx)); 
        }else{
            System.out.println("奔跑速度為:"+ f.distance2(fx,fy));
        } 


    } 
}
    
