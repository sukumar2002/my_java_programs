import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionOfArray {
    static int[] union(int[] a1,int[] a2){
        Set<Integer> set=new LinkedHashSet<>();
        for(int n:a1){
            set.add(n);
        }

        for(int nu:a2){
              set.add(nu);
            }
       return set.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr1={3,58,101,4,83,2};
        int[] arr2={33,11,9,3,101,4,83};
        int[] res=union(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
}
