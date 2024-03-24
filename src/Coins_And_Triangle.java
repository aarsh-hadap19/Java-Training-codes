
import java.util.*;
public class Coins_And_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while (k!=0){
            int h=0,r=1;
            int n=sc.nextInt();
            while(r<=n){
                n-=r;
                r++;
                h++;
            }
            System.out.println(h);
            k--;
        }
    }
}
