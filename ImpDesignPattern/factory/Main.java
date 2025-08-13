package ImpDesignPattern.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shape = new ShapeFactory();
        Shape circleShape = shape.getShape("Circle");
        circleShape.draw();
    } 
}
