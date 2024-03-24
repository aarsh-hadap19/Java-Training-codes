import java.util.*;
public class Prefix_and_suffix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int l=str.length();
        int result=0;
        for(int i=1;i<l;i++){
            if(str.substring(0,i).equals(str.substring(l-i))){
                result=i;
            }
        }
        System.out.println(result);
    }
}
