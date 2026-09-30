public class Main {
    public static void main(String[] args) {
        int capA = 5;
        int capB = 3;
        int volA = 0;
        int volB = 0;
        int target = 4;
        while (volA != target && volA + volB != target) {
            if (volA == 0) {
                volA = capA;
                System.out.println("Fill jug A with " + volA + " litres");
            } else if (volB == capB) {
                volB = 0;
                System.out.println("Empty jug B");
            } else {
                int transfer = Math.min(volA, capB - volB);
                volA -= transfer;
                volB += transfer;
                System.out.println("Transfer " + transfer + " litres from jug A to jug B");
            }
            System.out.println("There are now " + volA + " litres in jug A and " + volB + " litres in jug B");
        }
        if (volA != target) {
            System.out.println("Transfer " + volB + " litres to jug A");
            volA += volB;
            volB = 0;
        }
        System.out.println("Jug A contains the desired quantity of water: " + volA);
    }
}
