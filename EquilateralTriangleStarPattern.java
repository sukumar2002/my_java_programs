public class EquilateralTriangleStarPattern {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int s=1;s<=(6-i);s++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+"     ");
            }
            System.out.println();
        }
    }
}
