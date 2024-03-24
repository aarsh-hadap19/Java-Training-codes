
import java.util.*;
public class The_first_digit_of_the_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long i=0;
        if(n<0){
            n*=-1;
        }
        while(n!=0){
            i=n%10;
            n/=10;
        }
        System.out.println(i);

    }
}
