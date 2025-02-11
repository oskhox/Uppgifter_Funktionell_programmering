package Uppgift_2;

public class OperationsMain {

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
        System.out.println("10 / 2 = " + operate(10, 2, division));

        //anropar operate mot MathOperation-interfacets default-metod, b blir alltid andra int
        System.out.println("10 + 5 och sen * 5 = " + operate(10, 5, addThenMultiply));
        System.out.println("15 + 5 och sen / 5 = " + operate(15, 5, addThenDivide));
        System.out.println("10 - 5 och sen * 5 = " + operate(10, 5, subtractThenMultiply));

        //skapar upp lambdas (instanser) för SingleDigitOperation-interfacet
        SingleDigitOperation square = (a) -> a * a;
        SingleDigitOperation posNegValue = (a) -> {
            if (a >= 1)
                return 1;
            else return 0;
        };

        //anropa lambdas inkl interface-metod
        System.out.println("7 i kvadrat = " + square.operate(7));
        System.out.println("12 i kvadrat = " + square.operate(12));
        System.out.println("1 står för positivt tal, 0 står för negativt tal:");
        System.out.println("15 är ett: " + posNegValue.operate(15) + " tal" );
        System.out.println("-3 är ett: " + posNegValue.operate(-3) + " tal" );
    }
}