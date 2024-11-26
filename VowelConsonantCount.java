import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine().toLowerCase();

        int consonants = 0;
        int vowels = 0;
        List<Character> lst = new ArrayList<>();

        for(char i : input.toCharArray()){
            if(i>='a' && i<='z'){
                if("aeiou".indexOf(i)!=-1 && lst.contains(i)!=true){
                    lst.add(i);
                    vowels++;
                }
                else if("aeiou".indexOf(i)==-1 && lst.contains(i)!=true){
                    consonants++;
                    lst.add(i);
                }
            }

        }

      

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
