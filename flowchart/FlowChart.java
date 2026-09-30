import java.util.ArrayList;
import java.util.List;
public class FlowChart {
    private List<Node> nodes;
    private Node startNode;
    private Node currentNode;
    public FlowChart() {
      nodes = new ArrayList<Node>();
      startNode = null;
      currentNode = null;
    }
    public ActionNode addAction(String title, double displayX, double displayY) {
        ActionNode actionNode = new ActionNode(title, displayX, displayY);
        nodes.add(actionNode);
        return actionNode;
    }
    public DecisionNode addDecision(String title, double displayX, double displayY) {
        DecisionNode decisionNode = new DecisionNode(title, displayX, displayY);
        nodes.add(decisionNode);
        return decisionNode;
    }
    public int getNbrNodes() {
        return nodes.size();
    }
    public Node getNode(int i) {
        return nodes.get(i);
    }
    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }
    public Node getCurrentNode() {
        return currentNode;
    }
    public void start() {
        currentNode = startNode;
    }
    public void advance(boolean choice) {
        if (currentNode != null) {
          currentNode = currentNode.getNext(choice);
        }
    }
}
