
import java.util.*;
public class SumAndProduct3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,p=1;
        while(n!=0){
            int i=n%10;
            sum+=i;
            p*=i;
            n/=10;
        }
        System.out.println(sum+" "+p);
    }
}
