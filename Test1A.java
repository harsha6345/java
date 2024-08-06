import java.util.Scanner;

public class Test1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range limit: ");
        int n = sc.nextInt();
        sc.close(); // Close the scanner

        System.out.println("Numbers in the form (k+1)*k:");
        for (int i = 1; i <= n; i++) {
            // Check if the number can be expressed as (k+1)*k
            int k = (int) Math.sqrt(i);
            if (k * (k + 1) == i) {
                System.out.println(i);
            }
        }
    }
}
