
import java.util.Scanner;
public class How_Many_Divisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            System.exit(0);
        }
        int count=0;
        for(int i=a;i<=b;i++){
            if(c%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
