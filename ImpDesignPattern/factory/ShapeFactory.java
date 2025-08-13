package ImpDesignPattern.factory;

public class ShapeFactory {
    public Shape getShape(String shape){
        if(shape.equals("Circle")){
            return new Circle();
        }
        return new Triangle();
    }
}
