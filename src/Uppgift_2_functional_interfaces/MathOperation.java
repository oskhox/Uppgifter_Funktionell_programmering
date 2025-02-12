package Uppgift_2_functional_interfaces;

@FunctionalInterface
public interface MathOperation {
    int operation(int a, int b);

    //först en inre beräkning med parametrarna operation, a och b inom parantes
    //sedan en yttre beräkning med ny operator, genomförd beräkning, samt b som inparametrar
    default MathOperation twoOperations(MathOperation after) {
        return (a, b) -> after.operation(operation(a, b), b);
    }
}