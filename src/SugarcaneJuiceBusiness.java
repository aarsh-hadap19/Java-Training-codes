
import java.util.*;
public class SugarcaneJuiceBusiness{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int n=sc.nextInt();
            int amount =n*50;
            int per=(int)(amount-(0.70*amount));
            System.out.println(per);
            k--;
        }
    }
}
