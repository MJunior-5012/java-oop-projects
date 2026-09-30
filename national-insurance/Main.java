import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome to the NI Program");
      System.out.print("Enter employee name: ");
      String name = scanner.nextLine();
      System.out.print("Enter employee NI number: ");
      String niNumber = scanner.nextLine();
      NIRecord record = new NIRecord(name, niNumber);
      while(true) {
        System.out.print("Enter employer name (or Q to finish entering employment details):");
        String employer = scanner.nextLine();
        if(employer.equalsIgnoreCase("Q")) {
            break;
        }
        System.out.print("Enter payment: ");
        double payment = scanner.nextDouble();
        scanner.nextLine();
        Employment employment = new Employment(employer, payment);
        record.addEmployment(employment);
      }
      System.out.println("NI due: " + record.getTotalNI());
      if (record.meetsCriteria()) {
          System.out.println("Employee has got their stamps");
      } else {
          System.out.println("Employee has not got their stamps");
      }
      System.out.println("Goodbye");
      scanner.close();
    }
}
