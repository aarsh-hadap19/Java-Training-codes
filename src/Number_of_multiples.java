import java.util.*;
public class Number_of_multiples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int count = 0;
        for(int i=1;i<=n;i++){
            if(i%3==0){
                count++;
            }
            if(i%5==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
