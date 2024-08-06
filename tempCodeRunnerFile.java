import java.util.*;

public class FrequencyCounter {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        input.close();

        Map<Character, Integer> result = new HashMap<Character, Integer>();

        result = fCount(str);

        System.out.println(result);
    }

    public static Map<Character, Integer> fCount(String str) {
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            int c = map.getOrDefault(str.charAt(i), 0);

            map.put(str.charAt(i), c);
        }

        return map;
    }
}