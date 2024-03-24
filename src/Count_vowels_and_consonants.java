import java.util.Scanner;

public class Count_vowels_and_consonants {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.next();
            int V_count=0,C_count=0;
            char ch[]=str.toCharArray() ;
            for(int i=0;i<ch.length;i++){
                if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                    V_count++;
                }
                else {
                    C_count++;
                }
            }
            System.out.println(V_count+" "+C_count);
        }
    }


