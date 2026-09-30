public class DecisionNode extends Node {
    private Node yesNode;
    private Node noNode;
    public DecisionNode(String title, double displayX, double displayY) {
      super(title, displayX, displayY);
    }
    @Override
    public Node getNext(boolean choice) {
        if (choice) {
          return yesNode;
        } else {
          return noNode;
        }
    }
    public void setNext(Node node, boolean choice) {
      if (choice) {
        yesNode = node;
      } else {
        noNode = node;
      }
    }
}
