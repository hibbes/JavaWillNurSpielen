import java.awt.Color;

public class SimpleTriangle extends GeometricObject {

    public SimpleTriangle(Vertex pos, double width) {
        super(pos, width, Math.sqrt(3) / 2 * width, new Color(0, 0, 0));
    }

    public SimpleTriangle(double x, double y, double width, double height) {
        super(new Vertex(x, y), width, height, new Color(0, 0, 0));
    }

    @Override
    public double area() {
        return width * height / 2;
    }
}
