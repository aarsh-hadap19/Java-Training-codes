import java.util.HashMap;
import java.util.Scanner;

public class Find_First_Repeating_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T= sc.nextInt();
        for(int j=0;j<T;j++){

            String A=sc.next();

            HashMap<Character, Integer> hashMap = new HashMap<>();


            for (int i = 0; i < A.length(); i++) {
                char current=A.charAt(i);
                if(hashMap.containsKey(current)){
                    hashMap.put(current,hashMap.get(current)+1);
                }
                else{
                    hashMap.put(current,1);
                }
            }
            int flag=1;
            char current=' ';
            for (int i = 0; i < A.length(); i++) {
                current=A.charAt(i);
                if (hashMap.get(current)>=2) {
                    flag=0;
                    break;
                }
            }
            if(flag==0){
                System.out.println(current);
            }
            else{
                System.out.println(".");
            }
        }


    }
}
//..