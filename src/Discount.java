
import java.util.*;
public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int n=sc.nextInt();
            if(n<0){
                System.exit(0);
            }
            int res=100-n;
            System.out.println(res);
            k--;
        }
    }
}
