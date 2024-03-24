
import java.util.*;
public class theatreSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        if(n<0 || m<0 || a<0){
            System.exit(0);
        }
        int rec=n*m;
        int fg=a*a;
        System.out.println(rec%fg);
    }
}
