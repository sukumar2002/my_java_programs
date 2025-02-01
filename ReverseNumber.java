import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseNumber
{
    public static int reverse(int num)
    {
        int sum=0;
       while(num!=0)
       {
          int rem=num%10;
          sum=sum*10+rem;
          num=num/10;
       }
       return sum;
    }
    public static void main(String[] args)
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number:");
            int num=sc.nextInt();
            int reversedNumber=reverse(num);
            System.out.println("Reversed Number:"+reversedNumber);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Only Numbers allowed");
        }
    }
}
