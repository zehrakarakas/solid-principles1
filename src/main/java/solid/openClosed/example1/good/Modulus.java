package solid.openClosed.example1.good;

public class Modulus implements Operation{
    @Override
    public void calculate(int num1, int num2) {
        System.out.println(num1 % num2);
    }
}
