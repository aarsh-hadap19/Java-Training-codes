
import java.util.*;
public class Find_duplicate_element_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(nums[i]==nums[j]) {
                    System.out.println(nums[i]);
                }
            }
        }
    }
}
