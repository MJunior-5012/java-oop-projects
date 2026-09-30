public class Person {
    private final String name;
    private final int sport;
    private final int reading;
    private final int cinema;
    public Person(String name, int sport, int reading, int cinema) {
        this.name = name;
        this.sport = sport;
        this.reading = reading;
        this.cinema = cinema;
    }
    public String getName() { return name; }
    public int getSport() { return sport; }
    public int getReading() { return reading; }
    public int getCinema() { return cinema; }
}
