public class Main {
    public static void main(String[] args) {
        TownList towns = new TownList();
        towns.addTown(new Town("Example A", 1000, 10));
        towns.addTown(new Town("Example B", 800, 2));
        towns.addTown(new Town("Example C", 2000, 30));
        System.out.println("Total population: " + towns.getTotalPopulation());
        System.out.println("Largest population: " + towns.getHighest(new PopulationComparator()).getName());
        System.out.println("Highest density: " + towns.getHighest(new DensityComparator()).getName());
    }
}
