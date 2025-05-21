public class FloydsTrianglePatteren {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++) {
            int count=i;
            for(int s=0;s>5;s++) {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++) {
                System.out.print(count+" ");
                count=count+j;
            }
            System.out.println();
        }
    }
}
