import java.util.*;
public class A1113322_0421_1 {
        public static void main(String [] argv){
            String mail;   
            do{
                System.out.print("請輸入email:");
                Scanner sc=new Scanner(System.in);
                mail=sc.next();
                if(mail.matches("[a-z,0-9]+[@]{1}[a-z,0-9]+[.]{1}(com){1}")){
                    System.out.println("格式正確");
                }
                else{
                    System.out.println("格式錯誤");
                }
            }while(!mail.matches("[a-z,0-9]+[@]{1}[a-z,0-9]+[.]{1}(com){1}"));
        }
        
    }
