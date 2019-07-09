package calc;

public class CalculatorWithLambdas {

    //Implementing addition as a lamdba expression
    static ArithmeticOperation addition = (first, second) -> {
      double result = first + second;
        System.out.println("" + first + " + " +
                second + " = " + result);
        return result;
    };

    //Implementing substraction as a lamdba expression
    static ArithmeticOperation substraction = (first, second) -> {
        double result = first - second;
        System.out.println("" + first + " - " +
                second + " = " + result);
        return result;
    };

    public static double calculate(ArithmeticOperation whatToDo, double a, double b) {
     return whatToDo.performOperation(a, b);
    }

    public static void main(String[] args) {
        calculate(addition, 3.52, 5.32);
        calculate(substraction, 4.22, 1.07);
    }

}
