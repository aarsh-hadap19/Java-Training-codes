
import java.util.*;
public class BatteryLow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int n=sc.nextInt();
            if(n<=15){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            k--;
        }
    }
}
