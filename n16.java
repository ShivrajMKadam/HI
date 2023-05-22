import java.util.HashMap;
import java.util.Scanner;
public class n16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        String[] words = input.split(" ");

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        System.out.println(wordCountMap);

        scanner.close();
    }
}
