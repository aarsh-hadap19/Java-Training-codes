
import java.util.*;
public class WatchingMoviesAt2x {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(y%2!=0){
            System.exit(0);
        }
        else{
            y/=2;
            x-=y;
            System.out.println(x);
        }
    }
}
