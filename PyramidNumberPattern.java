public class PyramidNumberPattern {
    public static void main(String[] args) {
        int i,j,s;
        for(i=1;i<=5;i++) {
            for(s=0;s<(5-i);s++) {
                System.out.print("  ");
            }
            for(j=i;j>=1;j--) {
                System.out.print(j+" ");
            }
            for(j=2;j<=i;j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }

    }
}
