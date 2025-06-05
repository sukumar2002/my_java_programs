import java.util.Arrays;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr={10,23,10,39,20,30,23};
        int[] unique=Arrays.stream(arr).distinct().toArray();
        System.out.print("Unique elements in array:"+Arrays.toString(unique));
    }
}
