package Lambdas.Calculator;

public class Calculator {
    public static void main(String[] args) {
        CalculateAction add = (a, b) -> a + b;
        CalculateAction sub = (a, b) -> a - b;
        CalculateAction mul = (a, b) -> a * b;
        CalculateAction div = (a, b) -> a / b;
        CalculateAction mod = (a, b) -> a % b;

        System.out.println(add.calculate(1, 2));
        System.out.println(sub.calculate(1, 2));
        System.out.println(mul.calculate(3, 2));
        System.out.println(div.calculate(4, 2));
        System.out.println(mod.calculate(10, 7));
    }
}
