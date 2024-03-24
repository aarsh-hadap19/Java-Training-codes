
import java.util.*;
public class MinimumPizzas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int res=n*x;
            if(res%4==0){
                System.out.println(res/4);
            }
            else {
                System.out.println((res/4)+1);
            }
            k--;
        }
    }
}
