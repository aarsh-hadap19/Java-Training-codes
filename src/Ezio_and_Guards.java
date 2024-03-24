
import java.util.*;
public class Ezio_and_Guards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>=y){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            k--;
        }
    }
}
