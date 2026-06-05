import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) set.add(sc.nextInt());
        System.out.println("After removing duplicates: " + set);
        sc.close();
    }
}
