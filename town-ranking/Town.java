public class Town implements ITown {
    private String name;
    private int population;
    private double area;
    public Town(String name, int population, double area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getPopulation() {
        return population;
    }
    @Override
    public double getArea() {
        return area;
    }
}
