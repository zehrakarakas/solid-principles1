package solid.interfaceSegregation.example.good;

public class Chicken implements CanEat,CanFly{
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void fly() {
        System.out.println("Walking");
    }
}
