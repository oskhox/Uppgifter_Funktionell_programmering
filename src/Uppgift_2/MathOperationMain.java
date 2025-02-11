package Uppgift_2;

public class MathOperationMain {

    private static int operate(int a, int b, MathOperation mathOperation) {
        //anropar och returnerar lambdas från main
        return mathOperation.operation(a, b);
    }

    public static void main(String[] args) {
        //enkla beräkningar
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        //den andra beräkningen skickas in i default-metoden och blir dess after-parameter
        MathOperation addThenMultiply = addition.twoOperations(multiplication);
        MathOperation addThenDivide = addition.twoOperations(division);
        MathOperation subtractThenMultiply = subtraction.twoOperations(multiplication);

        //anropar operate
        System.out.println("10 + 5 = " + operate(10, 5, addition));
        System.out.println("10 - 5 = " + operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + operate(10, 5, division));

        //anropar operate mot interfacets default-metod, b blir alltid andra int
        System.out.println("10 + 5 och sen * 5 = " + operate(10, 5, addThenMultiply));
        System.out.println("10 + 5 och sen / 5 = " + operate(10, 5, addThenDivide));
        System.out.println("10 - 5 och sen * 5 = " + operate(10, 5, subtractThenMultiply));
    }
}