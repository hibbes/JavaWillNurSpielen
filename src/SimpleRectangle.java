import java.awt.Color;

public class SimpleRectangle extends GeometricObject {

    public SimpleRectangle(Vertex pos, double width, double height) {
        super(pos, width, height, new Color(0, 0, 0));
    }

    public SimpleRectangle(double x, double y, double width, double height) {
        super(new Vertex(x, y), width, height, new Color(0, 0, 0));
    }

}
