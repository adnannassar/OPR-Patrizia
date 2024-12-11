package Lambdas.CalculatorEnhanced;

public class CalculatorEnhanced {
    public static void main(String[] args) {
        System.out.println(((CalculateAction) (a, b) -> a + b).calculate(1,2));
        System.out.println(((CalculateAction) (a, b) -> a - b).calculate(1,2));
        System.out.println(((CalculateAction) (a, b) -> a * b).calculate(3,2));
        System.out.println(((CalculateAction) (a, b) -> a / b).calculate(4,2));
        System.out.println(((CalculateAction) (a, b) -> a % b).calculate(10,7));
    }

    @FunctionalInterface
    private interface CalculateAction {
        int calculate(int a, int b);
    }
}
