
import java.util.*;
public class ChefAndCandies{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a=n-x;
            if(x>=n){
                System.out.println(0);
            }
            else {
                int res = a / 4;

                if (a % 4 == 0) {
                    System.out.println(res);
                } else {
                    System.out.println(res + 1);
                }
            }
            k--;
        }
    }
}
