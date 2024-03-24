import java.util.Scanner;

public class Digits_in_a_string {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.next();
            int count=0;
            char ch[]=str.toCharArray() ;
            for(int i=0;i<ch.length;i++){
                if (ch[i] == '1' || ch[i] == '2' || ch[i] == '3' || ch[i] == '4' || ch[i] == '5' || ch[i] == '6' || ch[i] == '7' || ch[i] == '8' || ch[i] == '9' || ch[i] == '0') {
                    count++;
                }
            }
            if(ch.length==count){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }


