import java.util.Arrays;

public class MoveZerosToEnd {
    public static int[] moveZerosToEnd(int[] arr){
        int[] res=new int[arr.length];
        int index=0;
        for(int num:arr){
            if(num!=0){
                res[index++]=num;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={0,0,-1};
        int[] updated=MoveZerosToEnd.moveZerosToEnd(arr);
        System.out.println("After moving zeroes: " + Arrays.toString(updated));
    }
}
