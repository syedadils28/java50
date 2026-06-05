import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String bin = sc.next();
        int decimal = 0, power = 1;
        for (int i = bin.length() - 1; i >= 0; i--) {
            char c = bin.charAt(i);
            if (c != '0' && c != '1') { System.out.println("Invalid binary!"); return; }
            decimal += (c - '0') * power;
            power *= 2;
        }
        System.out.println("Decimal: " + decimal);
        sc.close();
    }
}
