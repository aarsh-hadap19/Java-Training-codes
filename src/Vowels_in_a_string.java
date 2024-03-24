import java.util.*;
public class Vowels_in_a_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        char ch[]=str.toCharArray() ;
        for(int i=0;i<ch.length;i++){
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                count++;
            }
        }
        if(ch.length==count){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
