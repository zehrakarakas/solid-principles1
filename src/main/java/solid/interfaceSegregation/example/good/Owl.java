package solid.interfaceSegregation.example.good;

public class Owl implements CanWalk,CanEat,CanFly{
    @Override
    public void eat() {
        System.out.println("Eating.");
    }

    @Override
    public void fly() {
        System.out.println("Flying.");
    }

    @Override
    public void walk() {
        System.out.println("Walking.");
    }
}
