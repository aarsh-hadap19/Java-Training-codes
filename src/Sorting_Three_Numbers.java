import java.util.Scanner;

public class Sorting_Three_Numbers {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if((a>=b && a>=c) && b>=c){
                System.out.println(c+" "+b+" "+a);
            }
            else if((a>=b && a>=c) && c>=b){
                System.out.println(b+" "+c+" "+a);
            }
            else if((b>=a && b>=c) && a>=c){
                System.out.println(c+" "+a+" "+b);
            }
            else if((b>=a && b>=c) && c>=a){
                System.out.println(a+" "+c+" "+b);
            }
            else if((c>=a && c>=b) && a>=b){
                System.out.println(b+" "+a+" "+c);
            }
            else{
                System.out.println(a+" "+b+" "+c);
            }

        }
    }


