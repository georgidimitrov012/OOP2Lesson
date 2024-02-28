package shapes;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(0);

        double area = square.calculateArea();
        System.out.println("Area is: " + area);

        double perimeter = square.calculatePerimeter();
        System.out.println("Perimeter is: " + perimeter);

        System.out.println("============RECTANGLE==========");

        Shape rectangle = new Rectangle(2, 6);

        double rectangleArea = rectangle.calculateArea();
        System.out.println("Area is: " + rectangleArea);

        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter is: " + rectanglePerimeter);
    }
}
