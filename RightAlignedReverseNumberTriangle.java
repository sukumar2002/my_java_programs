public class RightAlignedReverseNumberTriangle {
    public static void main(String[] args) {
        for(int i=4;i>=1;i--){
            for(int s=0;s<(4-i);s++){
                System.out.print("  ");}
                for(int j=i;j>=1;j--){
                    System.out.print(j+" ");
                }
            System.out.println();
            }
        }
    }
