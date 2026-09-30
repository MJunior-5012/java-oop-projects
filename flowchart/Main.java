import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlowChart chart = new FlowChart();
        ActionNode start = chart.addAction("Check the connection", 0.5, 0.1);
        DecisionNode decision = chart.addDecision("Is the connection working?", 0.5, 0.4);
        ActionNode yes = chart.addAction("Continue using the application", 0.25, 0.8);
        ActionNode no = chart.addAction("Check the cable and restart the router", 0.75, 0.8);
        start.setNext(decision);
        decision.setNext(yes, true);
        decision.setNext(no, false);
        chart.setStartNode(start);
        chart.start();
        try (Scanner input = new Scanner(System.in)) {
            while (chart.getCurrentNode() != null) {
                Node node = chart.getCurrentNode();
                System.out.println(node.getTitle());
                boolean choice = true;
                if (node instanceof DecisionNode) {
                    System.out.print("Enter yes or no: ");
                    String answer = input.nextLine().trim();
                    while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                        System.out.print("Enter yes or no: ");
                        answer = input.nextLine().trim();
                    }
                    choice = answer.equalsIgnoreCase("yes");
                }
                chart.advance(choice);
            }
        }
    }
}
