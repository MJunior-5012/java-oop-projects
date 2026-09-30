import java.util.ArrayList;
import java.util.List;
public class TownList implements ITownList, IRankable {
    private List<ITown> towns;
    public TownList() {
        towns = new ArrayList<>();
    }
    @Override
    public void addTown(ITown town) {
        towns.add(town);
    }
    @Override
    public ITown getTown(int index) {
        return towns.get(index);
    }
    @Override
    public int getSize() {
        return towns.size();
    }
    @Override
    public double getTotalArea() {
        double total = 0;
        for (ITown t : towns) {
            total += t.getArea();
        }
        return total;
    }
    @Override
    public int getTotalPopulation() {
        int total = 0;
        for (ITown t : towns) {
            total += t.getPopulation();
        }
        return total;
    }
    @Override
public ITown getHighest(IComparator comparator) {
    if (towns.isEmpty()) return null;
    ITown highest = towns.get(0);
    for (ITown t : towns) {
        if (comparator.compare(t, highest) > 0) {
            highest = t;
        }
    }
    return highest;
}
  @Override
  public ITown getLowest(IComparator comparator) {
    if (towns.isEmpty()) return null;
    ITown lowest = towns.get(0);
    for (ITown t : towns) {
        if (comparator.compare(t, lowest) < 0) {
            lowest = t;
        }
    }
    return lowest;
  }
}
