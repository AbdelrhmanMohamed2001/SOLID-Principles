public class Main {
    public static void main(String[] args) {
        // Using Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Output: 50

        // Using Square - LSP Violation
        Rectangle square = new Square();
        square.setWidth(5);
        square.setHeight(10);
        System.out.println("Square Area: " + square.calculateArea()); // Output: 25 (Unexpected)

        // The Square subclass violates LSP because it changes the behavior of setWidth and setHeight methods.
    }
}