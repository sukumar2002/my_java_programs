public class LargestElementInArray {
    public static int largestElement(int[] arr){
        int max=arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={2,10,30,22,10,23};
        int res=LargestElementInArray.largestElement(arr);
        System.out.println("Largest Element in array:"+res);
    }
}
