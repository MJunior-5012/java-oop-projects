public class KDiamond extends KShape {
  private double width;
  private double height;
  public KDiamond(double xCen, double yCen, double width,
                     double height) {
    super(xCen,yCen);
    this.width = width;
    this.height = height;
  }
  public double getWidth() {
    return width;
  }
  public double getHeight() {
    return height;
  }
  @Override
  public boolean isInside(double x, double y) {
    double dx = Math.abs(x - getXCen());
    double dy = Math.abs(y - getYCen());
    return (2 * dx < width) && (2 * dy < height * (1 - (2 * dx / width)));
  }
  @Override
  public double getArea() {
    return (width * height) / 2.0;
  }
  @Override
  public double getPerimeter() {
    double side = Math.sqrt(Math.pow(width / 2.0, 2) + Math.pow(height / 2.0, 2));
    return 4 * side;
  }
}
