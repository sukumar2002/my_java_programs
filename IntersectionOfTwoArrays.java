import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    static int[] intersection(int[] a1,int[] a2){
        Set<Integer> set=new HashSet<>();
        for(int num:a1){
            set.add(num);
        }
        Set<Integer> intersection=new HashSet<>();
        for(int nu:a2){
            if(set.contains(nu)){
                intersection.add(nu);
            }
        }
        int[] res=intersection.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
    public static void main(String[] args) {
        int[] arr1={2,4,1,6,7};
        int[] arr2={4,1,5,9,5};
        int[] inter=intersection(arr1,arr2);
        System.out.println(Arrays.toString(inter));



    }
}
