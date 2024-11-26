import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        String[] lst = sentence.split("\\s+");

        StringBuilder rev = new StringBuilder();
        for(String word : lst){
            StringBuilder sb = new StringBuilder(word);
            rev.append(sb.reverse()).append(" ");
        }
        System.out.println(rev);


    }
}

