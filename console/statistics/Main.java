import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            long sum = 0;
            for (int i = 0; i < 6; i++) {
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();
                if (number < min) min = number;
                if (number > max) max = number;
                sum += number;
            }
            System.out.println("min = " + min + ", max = " + max + ", average = " + sum / 6.0);
        }
    }
}
