import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose shape: 1=Circle  2=Rectangle  3=Triangle");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.printf("Area of Circle = %.2f%n", Math.PI * r * r);
                break;
            case 2:
                System.out.print("Enter length and breadth: ");
                double l = sc.nextDouble(), b = sc.nextDouble();
                System.out.printf("Area of Rectangle = %.2f%n", l * b);
                break;
            case 3:
                System.out.print("Enter base and height: ");
                double base = sc.nextDouble(), h = sc.nextDouble();
                System.out.printf("Area of Triangle = %.2f%n", 0.5 * base * h);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
