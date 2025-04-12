public class SimpleCalculatorUsingLambda {
    public static void main(String[] args) {
        Calculator add= (num1,num2)->num1+num2;
        Calculator sub=(num1,num2)->num1-num2;
        Calculator mul=(num1,num2)->num1*num2;
        Calculator div=(num1,num2)->num1/num2;

        System.out.println("Addition:"+add.calculate(1,30));
        System.out.println("Subtraction:"+sub.calculate(3,1));
        System.out.println("Multiplication:"+mul.calculate(4, 20));
        System.out.println("Division:"+div.calculate(10, 5));
    }
}
@FunctionalInterface
interface Calculator {
    int calculate(int num1,int num2);
}
