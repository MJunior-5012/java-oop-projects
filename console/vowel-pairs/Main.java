import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine().toLowerCase(Locale.ROOT);
            int count = 0;
            for (int i = 0; i < input.length() - 1; i++) {
                if (isVowel(input.charAt(i)) && isVowel(input.charAt(i + 1))) count++;
            }
            System.out.println(count);
        }
    }
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
