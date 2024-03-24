import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int n1=n/1000;
        int n2=n%10;
        System.out.println(n1+n2);
    }
}
