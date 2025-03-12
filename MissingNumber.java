public class MissingNumber {
    public static int missingNumber(int[] arr){
        int sum=0;
        for (int num : arr) {
            sum += num;
        }
        int n=arr.length+1;
        int na=(n*(n+1)/2);
        return na-sum;
    }
    public static void main(String[] args){
        int[] arr={1,2,4,5,6,8,9,10,7};
        int missing=MissingNumber.missingNumber(arr);
        System.out.println("Missing Number is:"+missing);
    }
}
