
import java.util.*;
public class Watch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sec=sc.nextInt();
        int hr=sec/3600;
        int min=(sec/60)%60;
        sec%=60;
        System.out.println(hr+":"+min+":"+sec);
    }
}
