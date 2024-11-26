import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input);

        String reverse = sb.reverse().toString();

        if(input.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }   
    }
}
