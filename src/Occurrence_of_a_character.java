
import java.util.*;
public class Occurrence_of_a_character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray() ;
        char c=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
