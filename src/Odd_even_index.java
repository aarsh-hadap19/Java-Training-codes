
import java.util.*;
public class Odd_even_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch[]=str.toCharArray() ;
        for(int i=0;i<ch.length;i++){
            if(i%2!=0){
                System.out.print(ch[i]);
            }
        }
        for(int i=0;i<ch.length;i++){
            if(i%2==0){
                System.out.print(ch[i]);
            }
        }
    }
}
