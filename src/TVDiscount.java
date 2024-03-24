
import java.util.*;
public class TVDiscount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();

            if(c<0||d<0){
                System.exit(0);
            }
            int d1=a-c;
            int d2=b-d;
            if(d1<d2){
                System.out.println("First");
            }
            else if(d2<d1){
                System.out.println("Second");
            }
            else {
                System.out.println("Any");
            }

            k--;
        }
    }
}
