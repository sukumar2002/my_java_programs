import java.util.Arrays;

public class ReverseAnArray {
    public static int[] reverse(int[] arr){
        int[] a=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            a[i] = arr[arr.length - 1 - i];
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr={2,31,7,20,3,10};
        int[] res=ReverseAnArray.reverse(arr);
        System.out.println("Reversed:"+Arrays.toString(res));

    }
}
