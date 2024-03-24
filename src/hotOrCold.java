
import java.util.*;
public class hotOrCold {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int n=sc.nextInt();
            if(n>20){
                System.out.println("Hot");
            }
            else{
                System.out.println("Cold");
            }
            k--;
        }
    }
}
