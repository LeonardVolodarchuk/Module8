package graphicEditor;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getPerimeter(){
        return 4*side;
    }

    @Override
    public String getName() {
        return "graphicEditor.Square";
    }
}
