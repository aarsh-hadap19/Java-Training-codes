
import java.util.*;
public class Bubble_Sort_Adhoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0){
            int count=0;
            int size=sc.nextInt();
            int []nums=new int[size];
            for (int i=0;i<size;i++){
                nums[i]=sc.nextInt();
            }
            for (int i=0;i<size-1;i++){
                for (int j=0;j<size-i-1;j++){
                    if(nums[j]>nums[j+1]){
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                        count++;
                    }
                }
            }
            System.out.println(count);
            k--;
        }
    }
}
