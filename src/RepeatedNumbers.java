import java.util.*;
public class RepeatedNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while (k!=0){
            int n= sc.nextInt();
            int []nums=new int[n];
            int []dup=new int[n];

            for(int i=0;i<n;i++){
                nums[i]= sc.nextInt();
                int r=nums[i];
                dup[r]++;
            }
            for(int i=0;i<n;i++){
                if(dup[i]>1){
                    System.out.print(i+" ");
                }
            }
            k--;
            System.out.println();
        }
    }
}