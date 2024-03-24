import java.util.*;
public class isTrangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long b=sc.nextLong();
        long c=sc.nextLong();
        if(a+b > c && b+c > a && a+c > b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
