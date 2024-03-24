
import java.util.*;
public class Sort_0s_and_1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while (k!=0){
            int size=sc.nextInt();
            int []nums=new int[size];
            int count0=0,count1=0;
            for (int i=0;i<size;i++){
                nums[i]=sc.nextInt();
            }
            for (int i=0;i<size;i++){
                if(nums[i]==0){
                    count0++;
                }
                else if(nums[i]==1){
                    count1++;
                }
            }
            for (int i=0;i<count0;i++){
                System.out.print(0+" ");
            }
            for (int i=0;i<count1;i++){
                System.out.print(1+" ");
            }
            System.out.println();
            k--;
        }
    }
}
