
import java.util.Scanner;
public class Swapping_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(i<3000){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if ((x == 0 && y == 0)||(x>10000||y>10000)) {
                System.exit(0);
            }
            else if(x>y) {
                int temp = x;
                x = y;
                y = temp;
                System.out.println(x + " " + y);
                i++;
            }
            else {
                System.out.println(x + " " + y);
            }
        }
    }

}