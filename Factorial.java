import java.util.Scanner;

public class Factorial
{
    public static int findFact(int num) {
        int sum=1;
         for(int i=num;i>=1;i--) {
             sum = sum*i;
         }
         return sum;
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            System.out.println("Factorial is:" + findFact(num));
        }
        catch(Exception e) {
            System.out.print("Please enter numeric numbers only");
        }
    }
}
