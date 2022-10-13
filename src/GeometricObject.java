import java.awt.Color;

public class GeometricObject {
    Vertex pos;
    double width;
    double height;
    public Color color;

    public GeometricObject(Vertex pos, double width, double height, Color color) {
        this.pos = pos;
        this.width = width;
        this.height = height;
        this.color = color;

        if (width < 0) {
            this.width = -width;
        }
        if (height < 0) {
            this.height = -height;
        }

        if (pos.x < 0) {
            this.pos.x = -pos.x;
        }

        if (pos.y < 0) {
            this.pos.y = -pos.y;
        }

    }

    public GeometricObject(double x, double y, double width, double height) {
        this(new Vertex(x, y), width, height, new Color(0, 0, 0));
    }

    public GeometricObject(double width, double height) {
        this(0, 0, width, height);
    }

    public GeometricObject(double width) {
        this(width, width);
    }

    public GeometricObject(Vertex v) {
        this(v, 0, 0, new Color(0, 0, 0));
    }

    public GeometricObject() {
        this(10, 10);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Vertex getPos() {
        return pos;
    }

    public String toString() {
        return "width= " + width + " height= " + height + " pos= " + pos;

    }

    public double circumference() {
        return (height + width) * 2;
    }

    public double area() {
        return height * width;
    }

    public boolean contains(Vertex v) {
        return v.x >= this.pos.x && this.pos.x + width >= v.x &&
                v.y >= this.pos.y && this.pos.y + height >= v.y;
    }

    public boolean isLargerThan(GeometricObject g) {
        return g.area() < this.area();
    }

    public void moveTo(Vertex v) {
        this.pos = v;
    }

    public void moveTo(double x, double y) {
        moveTo(new Vertex(x, y));
    }

    public void move(Vertex v) {
        moveTo(this.pos.add(v));
    }

    public boolean equals(Object thatObject) {
        if (thatObject instanceof GeometricObject) {
            GeometricObject that = (GeometricObject) thatObject;
            return this.height == that.height && this.width == that.width && this.pos.equals(that.pos);
        }
        return false;
    }

    /* Lukas */
    public boolean schneidet(GeometricObject that) {

        Vertex newV = new Vertex(this.pos.x - that.width, this.pos.y - that.height);
        GeometricObject big = new GeometricObject(newV, this.width + that.width, this.height + that.height,
                new Color(0, 0, 0));
        return big.contains(that.pos);

    }

}
