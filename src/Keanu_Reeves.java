
import java.util.*;
public class Keanu_Reeves {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count1 =0,count0 =0;
        sc.nextLine();
        String str= sc.next();
        char[] ch=str.toCharArray();
        for(int i=0;i<n;i++){
            if(ch[i]=='0'){
                count0++;
            }
            else {
                count1++;
            }
        }
       // System.out.println(count0+"--->"+count1);

        if(count1!=count0){
            System.out.println(1);
            System.out.println(str);
        }
        else {
            System.out.println(2);
            System.out.print(ch[0]+" ");
            for(int i=1;i<n;i++ ) {
                System.out.print(ch[i]);
            }
        }
    }
}
