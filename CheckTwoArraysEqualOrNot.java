import java.util.Arrays;

public class CheckTwoArraysEqualOrNot {
    public static boolean EqualsOrNot(int[] a1, int[] a2) {
        if (a1 == null || a2 == null || a1.length != a2.length)
            return false;

        int[] copy1 = Arrays.copyOf(a1, a1.length);
        int[] copy2 = Arrays.copyOf(a2, a2.length);
        Arrays.sort(copy1);
        Arrays.sort(copy2);

        return Arrays.equals(copy1, copy2);//First approch
        //return Arrays.equals(a1, a2);//second approch
        //return Arrays.mismatch(a1, a2) == -1;// Third approch

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2 };
        int[] arr2 = { 1, 2, 2 };
        System.out.println("Arrays equal or not:"+CheckTwoArraysEqualOrNot.EqualsOrNot(arr1, arr2));
    }
}
