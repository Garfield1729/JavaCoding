import java.util.*;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Your code here: Use a Map to count character frequencies

        HashMap<Character, Integer> freq = new HashMap<>();

        
        for(char i : input.toCharArray()){
            if(i!=' '){
                freq.put(i, freq.getOrDefault(i,0)+1);
            }
        }
        for(char j : freq.keySet()){
            System.out.println(j+" >> "+freq.get(j));
        }
        
        scanner.close();
    }
}
