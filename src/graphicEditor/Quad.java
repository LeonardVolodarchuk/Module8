package graphicEditor;

public class Quad extends Shape{
    private double length;
    private double width;

    public Quad(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public String getName() {
        return "Quad";
    }

    @Override
    public double getPerimeter() {
        return 2.0*(length+width);
    }
}
