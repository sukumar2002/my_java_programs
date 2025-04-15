import java.util.ArrayList;
import java.util.List;

public class SortingUsingLambdas {
    public static void main(String[] args) {
        Sorting sorting = arr -> {
            for(int i=0;i<arr.length-1;i++){
                int min=i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<arr[min]){
                        min=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
            List<Integer> sortedList = new ArrayList<>();
            for (int val : arr) {
                sortedList.add(val);
            }
            return sortedList;
        };
        int[] arr = {12, 1, 6, 32, 1348, 91, 231};
        System.out.println(sorting.sort(arr));
    }
}
@FunctionalInterface
interface Sorting{
    List<Integer> sort(int[] arr);
}
