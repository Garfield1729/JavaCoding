import java.util.*;

public class SortWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        String[] lst = sentence.split("\\s+");

        for(String word : lst){

            char[] carr= word.toCharArray();
            Arrays.sort(carr);
            String sorted = new String(carr);
            result.append(sorted).append(" ");
        }
        System.out.println(result);

    }
}