

import java.util.*;
public class greaterAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while (k!=0){
            int a=sc.nextInt();
            float b=sc.nextInt();
            int c=sc.nextInt();
            float res=(a+b)/2;
            if(res>c){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            k--;
        }
    }
}
