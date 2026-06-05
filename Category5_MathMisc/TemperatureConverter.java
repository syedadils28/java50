import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 = Celsius to Fahrenheit");
        System.out.println("2 = Fahrenheit to Celsius");
        System.out.print("Choose: ");
        int choice = sc.nextInt();
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        if (choice == 1) System.out.printf("%.2f°C = %.2f°F%n", temp, temp * 9 / 5 + 32);
        else if (choice == 2) System.out.printf("%.2f°F = %.2f°C%n", temp, (temp - 32) * 5 / 9);
        else System.out.println("Invalid choice.");
        sc.close();
    }
}
