package calc;

public class CalculatorWithAnonymousClasses {

    //The first anonymous class for addition
    static ArithmeticOperation addition = new ArithmeticOperation() {
        @Override
        public double performOperation(double first, double second) {
            double result = first + second;
            System.out.println("" + first + " + " +
                    second + " = " + result);
            return result;
        }
    };

    static ArithmeticOperation substraction = new ArithmeticOperation() {
        @Override
        public double performOperation(double first, double second) {
            double result = first - second;
            System.out.println("" + first + " - " +
                    second + " = " + result);
            return result;
        }
    };

    public static double calculate(ArithmeticOperation whatToDo, double a, double b) {
     return whatToDo.performOperation(a, b);
    }

    public static void main(String[] args) {
        calculate(addition, 2.33, 4.50);
        calculate(substraction, 2.55, 4.24);
    }
}
