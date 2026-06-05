import java.util.Scanner;

public class NumberToWords {
    static final String[] ones = {"", "One","Two","Three","Four","Five","Six","Seven",
        "Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
        "Sixteen","Seventeen","Eighteen","Nineteen"};
    static final String[] tens = {"","","Twenty","Thirty","Forty","Fifty",
        "Sixty","Seventy","Eighty","Ninety"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-99): ");
        int n = sc.nextInt();
        String words;
        if (n <= 0 || n > 99) words = "Out of range";
        else if (n < 20) words = ones[n];
        else words = tens[n / 10] + (n % 10 != 0 ? "-" + ones[n % 10] : "");
        System.out.println(n + " = " + words);
        sc.close();
    }
}
