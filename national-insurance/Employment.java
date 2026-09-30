public class Employment {
    private String employer;
    private double payment;
    public Employment(String employer, double payment) {
        this.employer = employer;
        this.payment = payment;
    }
    public String getEmployer() {
        return employer;
    }
    public double getPayment() {
        return payment;
    }
}
