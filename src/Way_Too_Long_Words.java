import java.util.*;
public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0) {
            int count=0;
            String str = sc.next();
            //System.out.println(str);
            if (str.length() <= 10) {
                System.out.println(str);
            }
            else {
                int g=str.length();
                System.out.println(str.charAt(0)+""+(g-2)+""+str.charAt(g-1));
            }
            k--;
        }
    }
}
