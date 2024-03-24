
import java.util.*;
public class Cumulative_Sum_Query {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums=new int[size];
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        arr[0]=nums[0];
        for(int i=1;i<size;i++){
            arr[i]=nums[i]+arr[i-1];
        }
//        print the prefixSum
//        for(int i=0;i<size;i++){
//            System.out.println(arr[i]+" ");
//        }
        int k=sc.nextInt();
        while (k!=0){
            int p=sc.nextInt();
            int q=sc.nextInt();
            if(p==0){
                System.out.println(arr[q]);
            }
            else {
                System.out.println(arr[q] - arr[p - 1]);
            }
            k--;
        }

    }
}
