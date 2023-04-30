import java.util.*;
public class A1113322_0421_2 {
    public static void main(String [] argv){
        String day; 
        do{
            System.out.print("請輸入年月日(格式為YYYY/MM/DD或MM/DD/YYYY):");
            Scanner sc=new Scanner (System.in);
            day=sc.next();
            if(day.matches("[0-9]{4}[/]{1}[0-9]{2}[/]{1}[0-9]{2}") || day.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")){
                if(day.charAt(4)=='/'){
                    System.out.println(day.substring(0,4)+"年"+day.substring(5,7)+"月"+day.substring(8,10)+"日");
                }
                else {
                    System.out.println(day.substring(0,2)+"月"+day.substring(3,5)+"日"+day.substring(6,10)+"年");
                }    
            }
            else{
                System.out.println("輸入格式錯誤，請重新輸入");
            }
        }while(!day.matches("[0-9]{4}[/]{1}[0-9]{2}[/]{1}[0-9]{2}") && !day.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"));    
    }

}
