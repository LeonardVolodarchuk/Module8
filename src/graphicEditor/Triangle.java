package graphicEditor;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
