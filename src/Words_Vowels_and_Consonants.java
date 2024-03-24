import java.util.*;
public class Words_Vowels_and_Consonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k!=0) {
            int W_count=0,V_count=0,C_count=0;
            String srt = sc.nextLine();
            char ch[] = srt.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                    V_count++;
                } else {
                    C_count++;
                }
                if(ch[i]==' '){
                    W_count++;
                }
            }
            System.out.println(W_count+" "+V_count+" "+C_count);
            k--;
        }
    }
}
