package javapractice;

/**
 * Functional Interface:- A interface which has exactly one abstract method.
 * Lambda Expression implements the functional interface.
 * that is lambda expression implement the only abstract method
 */
@FunctionalInterface
interface IMathFunction{
    int calculate(int a, int b);
    static void printResult(int a, int b, String function, IMathFunction fObj) {
        System.out.println("Result of the " + function + " is: " + fObj.calculate(a, b));
    }

}
public class MathOperationApp {
    public static void main(String[] args) {
//      IMathFunction add = (x, y) ->  x+y;
        IMathFunction add = Integer::sum; // this will implement same as in above line code
        IMathFunction subtraction = (x, y) -> x-y;
        IMathFunction multiply = (x, y) -> x*y;
        IMathFunction divide = (x, y) -> x/y;

        System.out.println("Addition: "+add.calculate(5,6));
        System.out.println("Subtraction is: " + subtraction.calculate(6,3));
        System.out.println("Multiplication: "+multiply.calculate(5,6));
        System.out.println("Division: "+divide.calculate(30, 6));

//      showing the result by passing the lambda expression as parameter in the printResult method
        IMathFunction.printResult(5,6, "Addition", add);
        IMathFunction.printResult(5, 6, "Subtraction", subtraction);
        IMathFunction.printResult(5,6, "Multiplication", multiply);
        IMathFunction.printResult(6, 2, "Division", divide);
    }
}
