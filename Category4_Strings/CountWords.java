import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim();
        int count = s.isEmpty() ? 0 : s.split("\\s+").length;
        System.out.println("Word count: " + count);
        sc.close();
    }
}
