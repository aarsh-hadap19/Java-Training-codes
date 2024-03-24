import java.util.*;
public class Decomposition_of_three_digit_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=100;i>=1;i/=10){
           int d=(n/i)%10;
           System.out.println(d);
       }
    }


}
