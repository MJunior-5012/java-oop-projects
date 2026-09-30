public abstract class Node {
    private String title;
    private double displayX;
    private double displayY;
    public Node(String title, double displayX, double displayY) {
      this.title = title;
      this.displayX = displayX;
      this.displayY = displayY;
    }
    public String getTitle() {
      return title;
    }
    public double getDisplayX() {
      return displayX;
    }
    public double getDisplayY() {
      return displayY;
    }
    public abstract Node getNext(boolean choice);
}
