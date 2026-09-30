public class DensityComparator implements IComparator {
    public DensityComparator() {
    }
    @Override
    public int compare(ITown t1, ITown t2) {
        double d1 = t1.getPopulation() / t1.getArea();
        double d2 = t2.getPopulation() / t2.getArea();
        return Double.compare(d1, d2);
    }
}
