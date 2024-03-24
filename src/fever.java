
import  java.util.*;
public class fever {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int n=sc.nextInt();
            if(n>103 || n<94){
                System.exit(0);
            }
            if(n>98){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            k--;
        }
    }
}
