import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        System.out.println("Absolute value: " + (n < 0 ? -n : n));
        sc.close();
    }
}
