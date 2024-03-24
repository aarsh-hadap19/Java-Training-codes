import java.util.Scanner;
public class NewPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = "codeforces";
        while (k != 0) {
            String str = sc.next();
            if(str.charAt(0)!=str.charAt(1)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            k--;
        }
    }
}


