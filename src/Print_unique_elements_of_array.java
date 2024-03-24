import java.util.*;

public class Print_unique_elements_of_array {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();

            int []nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                int count=0;
                for (int j=0;j<n;j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
                if(count==1){
                    arrayList.add(nums[i]);
                }
            }
            for (int i=0;i< arrayList.size();i++) {
                System.out.print(arrayList.get(i)+" ");
            }
        }
}



