
import java.util.Scanner;

public class Love_Story {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String s="codeforces";
        while(k!=0){
            int count=0;
            String str=sc.next();
            for(int i=0;i<10;i++){
                if(str.charAt(i)!=s.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
            k--;
        }
    }
}
