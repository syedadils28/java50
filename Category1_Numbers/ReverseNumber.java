import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), rev = 0, sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        while (n != 0) { rev = rev * 10 + n % 10; n /= 10; }
        System.out.println("Reversed: " + (sign * rev));
        sc.close();
    }
}
