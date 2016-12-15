public class Rectangle implements Shape{
    public double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void square() {
        System.out.println("Площа = " + a * b);
    }
}