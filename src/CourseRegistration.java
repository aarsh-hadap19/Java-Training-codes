import java.util.Scanner;

public class CourseRegistration {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int k=sc.nextInt();
            while(k!=0){
                int x=sc.nextInt();
                int y=sc.nextInt();
                int z= sc.nextInt();
                int dif=y-z;
                if(x<=dif){
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
                k--;
            }
        }
    }

