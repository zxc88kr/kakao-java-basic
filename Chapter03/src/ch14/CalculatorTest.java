package ch14;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalculator();
        
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.subtract(num1, num2));
        System.out.println(calc.multiply(num1, num2));
        System.out.println(calc.divide(num1, num2));

        calc.description();
        
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Calc.total(arr));
    }
}