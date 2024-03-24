import java.util.Scanner;
import java.lang.Math;
public class Compute_A_Power_B {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            long pow=1;
            for(int i=0;i<b;i++){
                pow*=a;
            }
            System.out.println(pow);
        }
    }




