import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Solve ax² + bx + c = 0");
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double disc = b * b - 4 * a * c;
        if (disc > 0) {
            double r1 = (-b + Math.sqrt(disc)) / (2 * a);
            double r2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.printf("Two real roots: x1 = %.4f, x2 = %.4f%n", r1, r2);
        } else if (disc == 0) {
            System.out.printf("One real root: x = %.4f%n", -b / (2 * a));
        } else {
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-disc) / (2 * a);
            System.out.printf("Complex roots: x1 = %.4f + %.4fi, x2 = %.4f - %.4fi%n",
                              realPart, imagPart, realPart, imagPart);
        }
        sc.close();
    }
}
