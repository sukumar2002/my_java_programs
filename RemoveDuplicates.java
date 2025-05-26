import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0; // Edge case: empty array

        int i = 0; // Pointer for unique elements
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) { // If new unique element found
                i++;
                arr[i] = arr[j]; // Move it forward
            }
        }
        return i + 1; // Length of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 4, 5, 5, 6, 8, 9}; // Sorted input
        int newLength = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
}
