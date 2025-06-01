public class RightAlignedTriangle {
    public static void main(String[] args) {
        int n = 6; // Number of rows

        System.out.println("Pattern 1: Right-Aligned Triangle\n");

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }
}
