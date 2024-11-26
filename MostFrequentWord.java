import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {
        
        String input = "apple;orange;orange;apple;apple";

        // Your code here
        // Hint: Use a HashMap to count word frequencies

        input= input.toLowerCase();

        String[] words = input.split(";");

        HashMap<String, Integer> freq = new HashMap<>();


        for(String word : words){
            freq.put(word, freq.getOrDefault(word, 0)+1);
        }

        String result = null;

        int max=0;

        for(String word : words){
            if(freq.get(word)>max){
                max=freq.get(word);
                result=word;
            }
        }

        System.out.println("Result = "+result);
        
    }
}
