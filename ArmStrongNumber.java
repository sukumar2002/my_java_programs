//ArmStrongNumber Program

import java.util.Scanner;

public class ArmStrongNumber
{
    public static boolean armStrongOrNot(int num)
    {
        int temp=num;
        int sum=0;
        while(num!=0)
        {
            int rem=num%10;
            sum=sum+(rem*rem*rem);
            num =num/10;
        }
        return temp==sum;


    }

    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number");
       int num=sc.nextInt();
       boolean armstrong =armStrongOrNot(num);
       System.out.println(armstrong?"Armstrong number":"not an armstrong number");

    }
}
