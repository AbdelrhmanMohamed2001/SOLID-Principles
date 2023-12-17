public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        ((Rectangle) rectangle).setWidth(5);
        ((Rectangle) rectangle).setHeight(10);
        System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Output: 50

        Shape square = new Square();
        ((Square) square).setSide(5);
        System.out.println("Square Area: " + square.calculateArea()); // Output: 25
    }
}
