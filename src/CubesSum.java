import java.util.Scanner;

public class CubesSum {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int sum=0;
            for(int i=1;i<=n;i++){
                sum=sum+(i*i*i);
            }
            System.out.println(sum);
        }
    }


