package solid.openClosed.example2.good;

public class Circle implements Shape{
    private double radius;
    @Override
    public void draw() {
        System.out.println("Drawing Circle.");
    }
}
