import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String[] words = sc.nextLine().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) sb.append(new StringBuilder(w).reverse()).append(" ");
        System.out.println("Reversed words: " + sb.toString().trim());
        sc.close();
    }
}
