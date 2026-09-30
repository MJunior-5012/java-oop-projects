import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
public class Main {
  private static final double NUMBER_SHAPES = 50;
  private static final int WIDTH = 500;
  private static final int HEIGHT = 200;
  private static final int MAX_SHAPE_DIMENSION = 40;
  private static final int MIN_SHAPE_DIMENSION = 10;
  public static void main(String[] args) {
    SwingUtilities.invokeLater(Main::showWindow);
  }

  private static void showWindow() {
    JFrame frame = new JFrame("Shapes");
    ArrayList<KShape> shapes = new ArrayList<>();
    frame.setSize(WIDTH, HEIGHT);
    recreateShapes(shapes);
    ShapePanel canvas = new ShapePanel(frame.getWidth(),frame.getHeight(), shapes);
    JButton butReset = new JButton("Reset");
    JButton butUp = new JButton("↑");
    JButton butLeft = new JButton("←");
    JButton butDown = new JButton("↓");
    JButton butRight = new JButton("→");
    JPanel buttons = new JPanel();
    buttons.add(butReset);
    butReset.addActionListener(e -> {
      recreateShapes(shapes);
      frame.repaint();
    });
    buttons.add(butUp);
    butUp.addActionListener(e -> {
      for (KShape shape:shapes) {
        shape.move(0, -10);
      }
      frame.repaint();
    });
    buttons.add(butLeft);
    butLeft.addActionListener(e -> {
      for (KShape shape:shapes) {
        shape.move(-10, 0);
      }
      frame.repaint();
    });
    buttons.add(butDown);
    butDown.addActionListener(e -> {
      for (KShape shape:shapes) {
        shape.move(0, 10);
      }
      frame.repaint();
    });
    buttons.add(butRight);
    butRight.addActionListener(e -> {
      for (KShape shape:shapes) {
        shape.move(10, 0);
      }
      frame.repaint();
    });
    Container content =  frame.getContentPane();
    content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
    frame.add(canvas);
    frame.add(buttons);
    frame.pack();
    frame.setResizable(false);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  private static void recreateShapes(ArrayList<KShape> shapes) {
    Random random = new Random();
    shapes.clear();
    for (int shapeNo = 0; shapeNo < NUMBER_SHAPES; shapeNo++) {
      double xCen = random.nextInt(WIDTH);
      double yCen = random.nextInt(HEIGHT);
      double width = MIN_SHAPE_DIMENSION + random.nextInt(MAX_SHAPE_DIMENSION-MIN_SHAPE_DIMENSION);
      if (random.nextBoolean()) {
        shapes.add(new KSquare(xCen, yCen, width));
      }
      else {
        double height = MIN_SHAPE_DIMENSION + random.nextInt(MAX_SHAPE_DIMENSION-MIN_SHAPE_DIMENSION);
        shapes.add(new KDiamond(xCen,yCen,width,height));
      }
    }
  }
}
