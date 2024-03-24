
import java.util.*;
public class YESorYES {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0) {
            String str=sc.next();
            if(str.equals("Yes")||str.equals("yEs")||str.equals("yeS")||str.equals("yes")||str.equals("YES") ||str.equals("YEs")||str.equals("yES")||str.equals("YeS")){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            k--;
        }

    }
}
