
import java.util.*;
public class Compress_a_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=1;
        char ch[]=str.toCharArray() ;
        System.out.print(ch[0]);
        for(int i=1;i<ch.length;i++){
            if(ch[i]==ch[i-1]){
                count++;
            }
           else{
                System.out.print(count);
                System.out.print(ch[i]);
                count=1;
            }
        }
        System.out.print(count);
    }
}
