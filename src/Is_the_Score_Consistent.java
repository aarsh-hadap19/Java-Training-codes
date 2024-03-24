import java.util.Scanner;

public class Is_the_Score_Consistent {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int k=sc.nextInt();
            while(k!=0){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int d= sc.nextInt();
                if((c>=a && d>=b)||((c>=a && b==d)||(b>=d && c==a))){
                    System.out.println("POSSIBLE");
                }
                else {
                    System.out.println("IMPOSSIBLE");
                }
                k--;
            }
        }
    }




