
import java.util.*;
public class Volume_Control {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                System.out.println(a-b);
            }
            else {
                System.out.println(b-a);
            }
            k--;
        }

    }
}
