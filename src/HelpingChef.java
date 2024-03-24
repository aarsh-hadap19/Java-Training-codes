
import java.util.*;
public class HelpingChef{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int n=sc.nextInt();
            if(n<-20 || n>20){
                System.exit(0);
            }
            else {
                if(n<10){
                    System.out.println("Thanks for helping Chef!");
                }
                else {
                    System.out.println(-1);
                }
            }
            k--;
        }
    }
}
