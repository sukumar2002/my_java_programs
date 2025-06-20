import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {
    static int[] merge(int[] a1,int[] a2){
        // List<Integer> list=new ArrayList<>();
        // for(int num:a1){
        //     list.add(num);
        // }
        // for(int nu:a2){
        //     list.add(nu);
        // }
        // return list.stream().mapToInt(Integer::intValue).toArray();
        int[] result = Arrays.copyOf(a1, a1.length + a2.length);
		System.arraycopy(a2, 0, result, a1.length, a2.length);
		return result;
    }
    public static void main(String[] args) {
        int[] arr1={2,4,15,53,6};
        int[] arr2={6,1,95,2};
        int[] res=merge(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
}
