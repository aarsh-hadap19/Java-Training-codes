
import java.util.*;
public class CreditScore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>=750 && x<=1000){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
