public class KSquare extends KShape{
  private double width;
  public KSquare(double xCen, double yCen, double width) {
    super(xCen, yCen);
    this.width = width;
  }
  public double getWidth() {
    return width;
  }
  @Override
  public boolean isInside(double x, double y) {
    double dx = Math.abs(x - getXCen());
    double dy = Math.abs(y - getYCen());
    return (2 * dx < width) && (2 * dy < width);
  }
  @Override
  public double getArea() {
    return width * width;
  }
  @Override
  public double getPerimeter() {
    return 4 * width;
  }
}
