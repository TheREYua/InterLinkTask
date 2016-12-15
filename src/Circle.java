public class Circle implements Shape{
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void square() {
        System.out.println("Площа = " + Math.PI * radius * radius);
    }
}
