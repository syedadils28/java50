import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate (%): ");
        double r = sc.nextDouble();
        System.out.print("Enter time (years): ");
        double t = sc.nextDouble();
        System.out.print("Enter n (times compounded per year): ");
        int n = sc.nextInt();
        double amount = p * Math.pow(1 + r / (n * 100), n * t);
        System.out.printf("Total Amount      = %.2f%n", amount);
        System.out.printf("Compound Interest = %.2f%n", amount - p);
        sc.close();
    }
}
