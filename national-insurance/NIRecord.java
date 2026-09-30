import java.util.ArrayList;
public class NIRecord {
    private static final double LOWER_EARNINGS_LIMIT = 533;
    private static final double PRIMARY_THRESHOLD = 1048;
    private static final double UPPER_EARNINGS_LIMIT = 4189;
    private String name;
    private String niNumber;
    private ArrayList<Employment> employments = new ArrayList<>();
    public NIRecord(String name, String niNumber) {
        this.name = name;
        this.niNumber = niNumber;
    }
    public void addEmployment(Employment employ) {
        employments.add(employ);
    }
    public int getNumEmployments() {
        return employments.size();
    }
    public Employment getEmployment(int pos) {
        if (pos < 0 || pos >= employments.size()) {
            return null;
        }
        return employments.get(pos);
    }
    public boolean meetsCriteria() {
        for (Employment e : employments) {
            if (e.getPayment() >= LOWER_EARNINGS_LIMIT) {
                return true;
            }
        }
        return false;
    }
    public double getTotalNI() {
        double totalNI = 0;
        for (Employment e : employments) {
            double pay = e.getPayment();
            double ni = 0;
            if (pay > PRIMARY_THRESHOLD) {
              double upperBand = Math.min(pay, UPPER_EARNINGS_LIMIT);
              ni += 0.08 * (upperBand - PRIMARY_THRESHOLD);
              if (pay > UPPER_EARNINGS_LIMIT) {
                  ni += 0.02 * (pay - UPPER_EARNINGS_LIMIT);
              }
            }
            totalNI += ni;
        }
        return totalNI;
    }
}
