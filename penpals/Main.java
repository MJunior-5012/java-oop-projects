public class Main {
    public static void main(String[] args) {
        PenPals pals = new PenPals(10);
        pals.addMember(new Person("Sarah", 3, 2, 5));
        pals.addMember(new Person("Ann", 7, 2, 3));
        pals.addMember(new Person("Andy", 6, 3, 5));
        pals.addMember(new Person("Bill", 2, 6, 4));
        int suggestion = pals.getSuggestion(2);
        System.out.println("Suggestion for Andy: " + pals.getMember(suggestion).getName());
        PenPals single = new PenPals(5);
        single.addMember(new Person("OnlyPerson", 5, 5, 5));
        System.out.println("Single member suggestion: " + single.getSuggestion(0));
    }
}
