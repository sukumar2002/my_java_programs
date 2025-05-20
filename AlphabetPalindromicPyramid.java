public class AlphabetPalindromicPyramid {
    public static void main(String[] args) {
        char i,j;
        for(i='A';i<=70;i++) {
            for(int s=0;s<(70-i);s++) {
                System.out.print("   ");
            }
            for(j=i;j>=65;j--) {
                System.out.print(j+"  ");
            }
            for(j='B';j<=i;j++) {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
}
