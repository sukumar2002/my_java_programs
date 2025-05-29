public class FibonacciNumberPyramid {
    public static void main(String[] args) {
        int prev=0,curr=1;
        for(int r=1;r<=5;r++) {
            for(int s=1;s<=(5-r);s++) {
                System.out.print("    ");
            }
            for(int c=1;c<=r;c++) {
                int next=prev+curr;
                System.out.print(prev + "      ");
                prev = curr;
                curr = next;
            }
            System.out.println();
        }
    }
}
