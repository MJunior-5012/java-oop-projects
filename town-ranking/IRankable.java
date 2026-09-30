public interface IRankable {
    ITown getHighest(IComparator comparator); ITown getLowest(IComparator comparator);
}
