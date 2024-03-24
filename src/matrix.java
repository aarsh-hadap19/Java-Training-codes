
import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 3, n = 4;
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8,}, {9, 10, 11, 12}};
        //Printing the simple matrix elements
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.nextLine();
      //printing columnn first then row
        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                System.out.print(arr[j][i]+" ");
              }
              System.out.println();
          }

        //printing in zigzag fashion of row
        sc.nextLine();

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else {
                for (int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }

        sc.nextLine();

//         //printing in zigzag fashion of column

        for(int i=0;i<n;i++){
            if(i%2==0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            }
            else {
                for (int j=m-1;j>=0;j--){
                    System.out.print(arr[j][i] + " ");
                }
            }
            System.out.println();
        }
    }


}
