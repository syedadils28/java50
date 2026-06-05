import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int n = sc.nextInt();
        while (n >= 10) {
            int s = 0;
            while (n != 0) { s += n % 10; n /= 10; }
            n = s;
        }
        System.out.println("Digital Root: " + n);
        sc.close();
    }
}
