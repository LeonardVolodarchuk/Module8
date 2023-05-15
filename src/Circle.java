public class Circle extends Shape {
   private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
