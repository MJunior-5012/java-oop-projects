public class PopulationComparator implements IComparator {
    public PopulationComparator() {
    }
    @Override
    public int compare(ITown t1, ITown t2) {
        return Integer.compare(t1.getPopulation(), t2.getPopulation());
    }
}
