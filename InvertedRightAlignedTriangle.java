public class InvertedRightAlignedTriangle {
    public static void main(String[] args) {
        int n = 6; // Number of rows

        System.out.println("Pattern 2: Inverted Right-Aligned Triangle\n");

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("*");
            }
          
            System.out.println();
        }
    }
}
