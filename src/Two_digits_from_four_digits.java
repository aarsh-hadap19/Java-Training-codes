
import java.util.*;
public class Two_digits_from_four_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n/=10;
        n%=100;
        System.out.println(n);
    }
}
