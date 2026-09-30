import java.util.Objects;

public class PenPals {
    private final Person[] members;
    private int numMembers;
    public PenPals(int max) {
        if (max < 0) throw new IllegalArgumentException("Capacity cannot be negative");
        members = new Person[max];
    }
    public void addMember(Person member) {
        Objects.requireNonNull(member);
        if (numMembers == members.length) throw new IllegalStateException("Group is full");
        members[numMembers++] = member;
    }
    public int getNumMembers() { return numMembers; }
    public Person getMember(int index) {
        return index >= 0 && index < numMembers ? members[index] : null;
    }
    public void deleteMember(int index) {
        if (index < 0 || index >= numMembers) throw new IndexOutOfBoundsException(index);
        for (int i = index; i < numMembers - 1; i++) members[i] = members[i + 1];
        members[--numMembers] = null;
    }
    public int getSuggestion(int persIndex) {
        if (persIndex < 0 || persIndex >= numMembers) throw new IndexOutOfBoundsException(persIndex);
        Person base = members[persIndex];
        int bestIndex = -1;
        long minDistance = Long.MAX_VALUE;
        for (int i = 0; i < numMembers; i++) {
            if (i == persIndex) continue;
            long distance = Math.abs((long) members[i].getSport() - base.getSport())
                + Math.abs((long) members[i].getReading() - base.getReading())
                + Math.abs((long) members[i].getCinema() - base.getCinema());
            if (distance < minDistance) {
                minDistance = distance;
                bestIndex = i;
            }
        }
        return bestIndex;
    }
}
