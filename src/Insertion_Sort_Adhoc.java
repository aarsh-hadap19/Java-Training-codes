
import java.util.*;
public class Insertion_Sort_Adhoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while (k!=0){
            int index=0;
            int size=sc.nextInt();
            int []nums=new int[size];
            for (int i=0;i<size;i++){
                nums[i]=sc.nextInt();
            }
//            Insertion Sort
            for (int i=1;i<size;i++){
                int j=i-1;
                int change=nums[i];
                while (j>=0 && nums[j]>change){
                    nums[j+1]=nums[j];
                    j--;
                }
                nums[j+1]=change;
                index=j+1;
                System.out.print(index+" ");
            }
            System.out.println();

//            for (int i=0;i<size;i++){
//                System.out.print(nums[i]+" ");
//            }

            k--;
        }
    }
}
