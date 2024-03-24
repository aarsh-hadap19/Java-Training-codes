
import java.util.*;
public class Toggle_case_of_characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch[]=str.toCharArray() ;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90){
                ch[i]+=32;
            }
            else if(ch[i]>=97 && ch[i]<=122){
                ch[i]-=32;
            }
        }
        for (int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
