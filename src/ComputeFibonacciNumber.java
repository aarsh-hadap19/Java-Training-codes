import java.util.Scanner;

public class ComputeFibonacciNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int n1 = 1, n2 = 1, n3 = 0;
            int temp;
            if (n == 1 || n == 2) {
                System.out.println(1);
            } else {
                for (int i = 2; i <= n; i++) {
                    n3 = n1 + n2;
                    temp = n1;
                    n1 = n2;
                    n2 = n3;
                }
                System.out.println(n1);
            }
        }
    }


