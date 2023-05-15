import graphicEditor.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(1,2,3);
        Square square1 = new Square(12);
        Circle circle1 = new Circle(3.5);
        Trapezium trapezium1 = new Trapezium(2, 5, 10, 4 );
        Quad quad1 = new Quad(7, 15);
        ShapePrinter shapePrinter = new ShapePrinter();


        System.out.println(triangle1.getName());
        System.out.println(triangle1.getPerimeter());
        System.out.println(trapezium1.getName());
        System.out.println(trapezium1.getPerimeter());
        System.out.println(circle1.getName());
        System.out.println(circle1.getPerimeter());
        System.out.println(quad1.getName());
        System.out.println(quad1.getPerimeter());
        System.out.println(square1.getName());
        System.out.println(square1.getPerimeter());
        shapePrinter.printShapeName(circle1);
    }
}