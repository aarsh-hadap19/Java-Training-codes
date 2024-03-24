import java.util.Scanner;

public class CheckArmstrongNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i=0,sum=0;
            int on=n;
            while(n!=0){
                i=n%10;
                sum=sum+(i*i*i);
                n/=10;
            }
            if(sum==on){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }




