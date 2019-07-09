package calc;

public class Calculator {

    static double addTwoNumbers (double first, double second) {
        double result = first + second;
        System.out.println("" + first + " + " +
                            second + " = " + result);
        return result;
    }

    static double substractTwoNumbers (double first, double second) {
        double result = first - second;
        System.out.println("" + first + " - " +
                second + " = " + result);
        return result;
    }

    public static void main(String[] args) {
        addTwoNumbers(3.55, 2.55);
        substractTwoNumbers(3.55, 4.50);
    }
}
