public class Main {
    public static Payment findPayment(String paymentRef, Payment[] payments) {
        for (Payment payment : payments) {
            if (payment != null && payment.getPaymentRef().equals(paymentRef)) return payment;
        }
        return null;
    }
    public static void main(String[] args) {
        Payment first = new Payment("PAY-001", "Alex", 12.50);
        first.setHoursWorked(16);
        Payment second = new Payment("PAY-002", "Sam", 14);
        second.setHoursWorked(8);
        Payment found = findPayment("PAY-001", new Payment[]{first, second});
        System.out.printf("%s: %.2f%n", found.getPayee(), found.getTotalPay());
    }
}
