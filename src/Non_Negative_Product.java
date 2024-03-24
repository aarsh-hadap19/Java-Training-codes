
import java.util.*;
public class Non_Negative_Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int count=0;
        while(k!=0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]>0){
                    count++;
                }
            }
            if(count%2==0){
                System.out.println(0);
            }
            else {
                System.out.println(1);
            }

            k--;
        }
    }
}
