
import java.util.*;
public class prefixSum_increment_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        //int size=sc.nextInt();
        int [] nums=new int[8];
        int [] arr=new int[8];
        while (k!=0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int p=sc.nextInt();
            nums[m-1]=p;
            nums[n]=0-p;
            k--;
        }
        arr[0]=nums[0];
        for (int i=1;i<8;i++){
            arr[i]=nums[i]+arr[i-1];
        }
        for (int i=0;i<8;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
