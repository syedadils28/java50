import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate (%): ");
        double r = sc.nextDouble();
        System.out.print("Enter time (years): ");
        double t = sc.nextDouble();
        double si = (p * r * t) / 100;
        System.out.printf("Simple Interest = %.2f%n", si);
        System.out.printf("Total Amount    = %.2f%n", p + si);
        sc.close();
    }
}
