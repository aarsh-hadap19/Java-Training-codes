import java.util.Scanner;

public class Range {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(c>a && c>b && b>a){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

        }
    }
