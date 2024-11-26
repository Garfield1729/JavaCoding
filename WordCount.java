
import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        
        String input = "Apple;orange;grape;orange";

        input = input.toLowerCase();

        String[] words = input.split(";");
        
        HashMap<String, Integer> freq = new HashMap<>();

        for(String word : words){
            freq.put(word, freq.getOrDefault(word, 0)+1);
        }

        for(String word : words){
            System.out.println(word+" : "+freq.get(word));
        }

        }
    
}
