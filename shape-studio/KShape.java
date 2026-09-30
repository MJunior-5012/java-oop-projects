public abstract class KShape {
    private double xCen;
    private double yCen;
    protected KShape(double xCen, double yCen) {
        this.xCen = xCen;
        this.yCen = yCen;
    }
    public double getXCen() { return xCen; }
    public double getYCen() { return yCen; }
    public void move(double dx, double dy) { xCen += dx; yCen += dy; }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean isInside(double x, double y);
}
