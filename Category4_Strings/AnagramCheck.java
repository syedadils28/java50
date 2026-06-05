import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        char[] a = sc.nextLine().replaceAll("\\s+","").toLowerCase().toCharArray();
        System.out.print("Enter second string: ");
        char[] b = sc.nextLine().replaceAll("\\s+","").toLowerCase().toCharArray();
        Arrays.sort(a); Arrays.sort(b);
        System.out.println(Arrays.equals(a, b) ? "Anagram!" : "Not an Anagram.");
        sc.close();
    }
}
