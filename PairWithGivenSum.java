import java.util.*;

public class PairWithGivenSum {
    public static void findPairs(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, -2, 4};
        int target = 9;
        System.out.println("Pairs with sum " + target + ":");
        findPairs(arr, target);
    }
}
