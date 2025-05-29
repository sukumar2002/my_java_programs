public class InvertedFibonacciTriangle {
    public static void main(String[] args) {
        int prev=0,curr=1;
        for (int r = 5; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                int next=prev+curr;
                System.out.print(prev + "   ");
                prev = curr;
                curr = next;
            }
            System.out.println();
        }
    }
}
