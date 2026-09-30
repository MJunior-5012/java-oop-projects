import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        String japanese = translateToJapanese("work","verbs.txt");
        System.out.println(japanese);
        japanese = translateToJapanese("work","talk","verbs.txt");
        System.out.println(japanese);
    }
    public static String translateToJapanese(String englishVerb, String filename)
            throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(new FileInputStream(filename));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split("=", 2);
            if (parts.length == 2) {
                if (parts[0].equals(englishVerb)) {
                    scanner.close();
                    return parts[1];
                }
            }
        }
        scanner.close();
        return null;
    }
    public static String translateToJapanese(String englishVerb1, String englishVerb2, String filename)
            throws FileNotFoundException, IOException {
        String verb1 = translateToJapanese(englishVerb1, filename);
        String verb2 = translateToJapanese(englishVerb2, filename);
        if (verb1 == null || verb2 == null) {
            return null;
        }
        if (!verb1.endsWith("masu")) {
            return null;
        }
        String modifiedVerb1 = verb1.substring(0, verb1.length() - 4) + "nagara ";
        return modifiedVerb1 + verb2;
    }
}
