public class ActionNode extends Node {
    private Node nextNode;
    public ActionNode(String title, double displayX, double displayY) {
        super(title, displayX, displayY);
    }
    public Node getNext(boolean choice) {
        return nextNode;
    }
    public void setNext(Node nextNode) {
        this.nextNode = nextNode;
    }
}
