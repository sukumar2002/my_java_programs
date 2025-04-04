public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first; // Update second largest
                first = num; // Update largest
            } else if (num > second && num != first) {
                second = num; // Update second largest only if it's not equal to first
            }
        }

        if (second == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found.");
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {3, 15, 2, 6, 7, 33, 100, 76, 99};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second Largest Number: " + secondLargest); // Output: 99
    }
}
