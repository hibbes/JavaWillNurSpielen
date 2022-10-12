import java.awt.Color;

public class PaintableOval extends SimpleOval implements Paintable {

    public PaintableOval(double width, double height, double x, double y, Color color) {
        super(new Vertex(x, y), width, height, color);
    }

    public PaintableOval(double width, double height, double x, double y) {
        this(width, height, x, y, new Color(0, 0, 0));
    }

    public void paintTo(java.awt.Graphics g) {
        g.setColor(color);
        g.fillOval((int) pos.x, (int) pos.y, (int) width, (int) height);
    }

}