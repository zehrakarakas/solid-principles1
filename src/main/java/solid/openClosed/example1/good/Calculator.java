package solid.openClosed.example1.good;

public class Calculator {
    public void calculate(Operation operation) {

        int num1 = 10;
        int num2 = 2;

        operation.calculate(num1, num2);

    }
}
