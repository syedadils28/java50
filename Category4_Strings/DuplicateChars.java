import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) map.merge(c, 1, Integer::sum);
        System.out.print("Duplicate characters: ");
        boolean found = false;
        for (Map.Entry<Character, Integer> e : map.entrySet())
            if (e.getValue() > 1) { System.out.print(e.getKey() + " "); found = true; }
        if (!found) System.out.print("None");
        System.out.println();
        sc.close();
    }
}
