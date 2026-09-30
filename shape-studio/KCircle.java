public class KCircle extends KShape {
  private double radius;
  public KCircle(double xCen, double yCen, double radius) {
    super(xCen,yCen);
    this.radius = radius;
  }
  public double getRadius() {
    return radius;
  }
  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }
  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }
  @Override
  public boolean isInside(double x, double y) {
    double dx = x - getXCen();
    double dy = y - getYCen();
    return (dx * dx + dy *dy) < (radius * radius);
  }
}
