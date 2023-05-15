package graphicEditor;

public class Trapezium extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    private double sideD;

    public Trapezium(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    @Override
    public String getName() {
        return "graphicEditor.Trapezium";
    }

    @Override
    public double getPerimeter() {
        return sideA+sideB+sideC+sideD;
    }
}
