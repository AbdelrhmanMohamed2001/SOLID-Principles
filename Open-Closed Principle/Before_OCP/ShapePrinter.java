public class ShapePrinter {
    public void DrawShape(Object shape){
        if (shape instanceof Rectangle){
            System.out.println("Draw Rectangle");
        } else if (shape instanceof Square) {
            System.out.println("Draw Square");
        }

    }
}
