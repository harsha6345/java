import java.util.*;

public class Commonpairs {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many pairs in HashMap 1: ");
        int n1 = scanner.nextInt();

        scanner.nextLine();

        HashMap<String, String> hashmap1 = new HashMap<>();

        System.out.println("Enter your " + n1 + "pairs");

        for (int i = 1; i <= n1; i++) {
            System.out.println("Enter pair " + i);

            String pairs[] = scanner.nextLine().split(" ");

            hashmap1.put(pairs[0], pairs[1]);
        }

        System.out.print("Enter how many pairs in HashMap 2: ");
        int n2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        HashMap<String, String> hashmap2 = new HashMap<>();
        System.out.println("Enter your " + n2 + " pairs of String for HashMap 2:");
        for (int i = 1; i <= n2; i++) {
            System.out.println("Enter Pair " + i);
            String[] pairs = scanner.nextLine().split(" ");
            hashmap2.put(pairs[0], pairs[1]);
        }

        int commonPairsCount = countCommonPairs(hashmap1, hashmap2);
        System.out.println("The number of key/value pairs are: " + commonPairsCount);

        scanner.close();

    }

    public static int countCommonPairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
        int count = 0;

        for (Map.Entry<String, String> entry : hashmap1.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (hashmap2.containsKey(key) && hashmap2.get(key).equals(value)) {
                count++;
            }
        }

        return count;
    }
}
