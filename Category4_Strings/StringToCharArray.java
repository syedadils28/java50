import java.util.Arrays;
import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        System.out.println("Character array: " + Arrays.toString(chars));
        sc.close();
    }
}
