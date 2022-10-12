import java.awt.Color;
import util.ShowInFrame;

public class PaintablePanel extends SizedPanel {

    Paintable pa;

    public PaintablePanel(Paintable pa) {
        this.pa = pa;
    };

    public void paintComponent(java.awt.Graphics g) {

        pa.paintTo(g);
    }

    public static void main(String[] args) {
        ShowInFrame.show(new PaintablePanel(new PaintableStar(new Vertex(100, 100), new Color(50, 200, 80))));
        // ShowInFrame.show(new PaintablePanel(new PaintableOval(200, 200, 130, 40)));

    }

}
