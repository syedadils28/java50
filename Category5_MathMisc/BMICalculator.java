import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double w = sc.nextDouble();
        System.out.print("Enter height (m): ");
        double h = sc.nextDouble();
        double bmi = w / (h * h);
        String category;
        if (bmi < 18.5) category = "Underweight";
        else if (bmi < 25) category = "Normal weight";
        else if (bmi < 30) category = "Overweight";
        else category = "Obese";
        System.out.printf("BMI = %.2f (%s)%n", bmi, category);
        sc.close();
    }
}
