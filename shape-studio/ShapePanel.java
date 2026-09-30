import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;

public class ShapePanel extends JPanel {
    private final List<KShape> shapes;
    public ShapePanel(int width, int height, List<KShape> shapes) {
        this.shapes = shapes;
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.WHITE);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(35, 85, 140));
        for (KShape shape : shapes) {
            int x = (int) Math.round(shape.getXCen());
            int y = (int) Math.round(shape.getYCen());
            if (shape instanceof KSquare) {
                int w = (int) Math.round(((KSquare) shape).getWidth());
                g.drawRect(x - w / 2, y - w / 2, w, w);
            } else if (shape instanceof KDiamond) {
                KDiamond d = (KDiamond) shape;
                int w = (int) Math.round(d.getWidth() / 2);
                int h = (int) Math.round(d.getHeight() / 2);
                g.drawPolygon(new int[]{x, x + w, x, x - w}, new int[]{y - h, y, y + h, y}, 4);
            } else if (shape instanceof KCircle) {
                int r = (int) Math.round(((KCircle) shape).getRadius());
                g.drawOval(x - r, y - r, 2 * r, 2 * r);
            }
        }
    }
}
