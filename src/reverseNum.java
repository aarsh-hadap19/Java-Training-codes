import java.util.*;
public class reverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,i=0;
        if(n<0){
            n*=-1;
            while(n!=0){
                i=n%10;
                rev=rev*10+i;
                n/=10;
            }
            rev *= -1;
            System.out.println(rev);
        }
        while(n!=0){
            i=n%10;
            rev=rev*10+i;
            n/=10;
        }
        System.out.println(rev);
        sc.close();
        // String a=sc.nextLine();
        // for(int i=a.length();i>0;i++){
        //     System.out.print(a);
        // }
        sc.close();
    }
}
