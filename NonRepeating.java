
import java.util.HashMap;

public class NonRepeating {

    public static void main(String[] args) {
        
        String input = "Malaiyalam";
        input=input.toLowerCase();

        char[] letters = input.toCharArray();

        HashMap<Character , Integer> freq = new HashMap<>();

        for(char i : letters){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }

        for(char i : letters){
            if(freq.get(i)==1){
                System.out.println("Result = "+i);
                break;
            }
        }

    }
}
