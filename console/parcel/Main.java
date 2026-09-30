import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the width of the parcel: ");
            double width = input.nextDouble();
            System.out.print("Enter the height of the parcel: ");
            double height = input.nextDouble();
            System.out.print("Enter the length of the parcel: ");
            double length = input.nextDouble();
            boolean valid = Double.isFinite(width) && Double.isFinite(height) && Double.isFinite(length)
                && width > 0 && height > 0 && length > 0;
            boolean allowed = valid && width + height + length <= 90 && width <= 60 && height <= 60 && length <= 60;
            System.out.println(allowed ? "parcel can be sent" : "parcel cannot be sent");
        }
    }
}
