import java.util.Scanner;

public class Increase_IQ {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            if(x>169 || x<100){
                System.exit(0);
            }
            else if((x+7)>170){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }


