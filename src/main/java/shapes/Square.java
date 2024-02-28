package shapes;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.out.println("Side length must be a positive number!");
        } else {
            this.side = side;
        }
    }
}
