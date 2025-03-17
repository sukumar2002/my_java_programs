public class MaximumSubArray {
    static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE; // Stores the maximum sum found
        int currentSum = 0; // Tracks sum of current subarray

        for (int num : arr) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
            int[] arr = {-2, 1, -3,2,5,1,-10,-4, 1, -5, 4};
            System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));

        }
}
