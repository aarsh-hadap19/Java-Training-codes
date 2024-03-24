
import java.util.*;
public class missingNumber {
    public static void main(String[] args) {
        int nums[]=new int[99];
        int n=nums.length;
        int a = 0, b = 0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();  
        }
        
        for (int i = 0; i < n; i++) {
            a += nums[i];
        }

        for (int i = 0; i <= n; i++) {
            b += i;
        }
        System.out.println(b-a);
        sc.close();
    }
}