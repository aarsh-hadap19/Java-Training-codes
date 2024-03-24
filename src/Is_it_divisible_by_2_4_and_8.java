
import  java.util.*;
public class Is_it_divisible_by_2_4_and_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if(n%2==0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        if(n%4==0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        if(n%8==0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
