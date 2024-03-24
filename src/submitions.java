
import  java.util.*;
public class submitions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int t=sc.nextInt();
            int s=(t*60)/30;
            System.out.println(s);
            k--;
        }
    }
}
