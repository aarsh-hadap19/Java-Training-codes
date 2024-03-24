import java.util.Scanner;

public class Miami_GP {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int k=sc.nextInt();
            while(k!=0){
                int x=sc.nextInt();
                int y=sc.nextInt();
                float per= (float) ((1.07)*x);
                if(per>=y){
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
                k--;
            }
        }
    }


