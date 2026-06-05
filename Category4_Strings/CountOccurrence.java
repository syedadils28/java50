import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter character to count: ");
        char c = sc.nextLine().charAt(0);
        long count = s.chars().filter(ch -> ch == c).count();
        System.out.println("'" + c + "' occurs " + count + " time(s).");
        sc.close();
    }
}
