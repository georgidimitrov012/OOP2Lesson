package shapes;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.out.println("Length must be a positive number!");
        } else {
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Width must be a positive number!");
        } else {
            this.width = width;
        }
    }
}
