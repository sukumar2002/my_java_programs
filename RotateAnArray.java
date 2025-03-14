import java.util.ArrayList;
import java.util.List;

public class RotateAnArray {
    static int[] rotate(int[] arr,int k){
        //List<Integer> list=new ArrayList<>();
        //int d=arr.length-k;
        int n=arr.length;
        int[] rotate=new int[n];
        for(int i=0;i<n-k;i++){
            rotate[i]=arr[k+i];
        }
        for(int i=0;i<k;i++){
            rotate[n-k+i]=arr[i];
        }
        return rotate;
    }
    public static void main(String[] args) {
        int[] arr={2,4,1,6,9,20};
        int k=3;
        int[] rotatedArr=rotate(arr,k);
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
}
