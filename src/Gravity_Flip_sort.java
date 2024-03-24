
import java.util.*;
public class Gravity_Flip_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            nums.add(a);
        }
        Collections.sort(nums);
        for (int i: nums){
            System.out.print(i+" ");
        }
    }
}
