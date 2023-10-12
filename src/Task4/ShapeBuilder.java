package Task4;
import java.util.ArrayList;

public class ShapeBuilder {


    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape() {
        shapes.add(new Circle(3));
        shapes.add(new Square(5));
    }

        public double getTotalArea() {
            double totalArea = 0;
            for (Shape s : shapes) {
                totalArea = totalArea + s.getArea();
            }
            return totalArea;

    }
}
