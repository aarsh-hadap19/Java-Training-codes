import java.util.Scanner;

public class Selection_Sort_Adhoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            //condition
            //int max = Integer.MIN_VALUE;
            for (int i = N - 1; i > 0; i--) {
                int max = arr[i];
                int max_idx = i;

                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] >= max) {
                        max = arr[j];
                        max_idx = j;
                    }
                }
                System.out.print(max_idx + " ");
                int temp = arr[i];
                arr[i] = max;
                arr[max_idx] = temp;

            }
            System.out.println();
        }
    }
}