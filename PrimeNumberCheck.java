import java.util.Scanner;

public class PrimeNumberCheck{
    public static boolean isPrimeNumber(int num){
         if(num==0||num==1){
             System.out.println("Nor prime ");
         }
         if(num==2){
             return true;
         }
         if(num%2==0){
             return false;
         }
         return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check prime or Not:");
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Negative numbers are not prime.");
            return;
        }
        System.out.println("IsPrimeNumber:"+isPrimeNumber(num));
    }
}
