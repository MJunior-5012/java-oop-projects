public class Payment {
    private final String paymentRef;
    private final String payee;
    private final double payRate;
    private double hoursWorked;
    public Payment(String paymentRef, String payee, double payRate) {
        this.paymentRef = paymentRef;
        this.payee = payee;
        this.payRate = payRate;
    }
    public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }
    public String getPaymentRef() { return paymentRef; }
    public String getPayee() { return payee; }
    public double getPayRate() { return payRate; }
    public double getHoursWorked() { return hoursWorked; }
    public double getTotalPay() { return payRate * hoursWorked; }
}
