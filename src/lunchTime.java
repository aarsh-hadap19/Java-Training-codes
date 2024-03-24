
import java.util.*;
public class lunchTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int n=sc.nextInt();
            if(n>12 || n<1){
                System.exit(0);
            }
            if(n<=4){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            k--;
        }
    }
}
