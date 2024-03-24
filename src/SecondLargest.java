
import java.util.*;
public class SecondLargest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a<=0||b<=0||c<=0){
                System.exit(0);
            }
            else {
                if((a>b && a<c)||(a<b && a>c)){
                    System.out.println(a);
                }
                else if((b>a && b<c)||(b>c && b<a)){
                    System.out.println(b);
                }
                else {
                    System.out.println(c);
                }
            }
            k--;
        }
    }
}
