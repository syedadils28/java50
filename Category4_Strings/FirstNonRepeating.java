import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) map.merge(c, 1, Integer::sum);
        char result = 0;
        for (Map.Entry<Character, Integer> e : map.entrySet())
            if (e.getValue() == 1) { result = e.getKey(); break; }
        System.out.println(result != 0 ? "First non-repeating character: " + result : "No non-repeating character found.");
        sc.close();
    }
}
