import java.util.HashMap;
import java.util.Scanner;

public class AnagramsEasy {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int k= sc.nextInt();
            while(k!=0){

                String A = sc.next();
                String b= sc.next();
                int count=0;
                HashMap<Character, Integer> hashMap = new HashMap<>();
                for (int i = 0; i < A.length(); i++) {
                    char current = A.charAt(i);
                    if (hashMap.containsKey(current)) {
                        hashMap.put(current, hashMap.get(current) + 1);
                    } else {
                        hashMap.put(current, 1);
                    }
                }
                for(int i=0;i<b.length();i++){
                    char current = b.charAt(i);
                    if (hashMap.containsKey(current)){
                        count++;
                    }
                }
                if(A.length()==count){
                    System.out.println("True");
                }
                else {
                    System.out.println("False");
                }
                k--;
            }
        }
    }

