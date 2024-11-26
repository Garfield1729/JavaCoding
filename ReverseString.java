import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Your code here
        // Hint: Use two pointers and check if characters are letters or not
        char[] letters = input.toCharArray();


        int left=0;
        int right= letters.length-1;

        while(left<right){

            // if(!Character.isLetter(letters[left])){
            //     left++;
            // }

            // else if(!Character.isLetter(letters[right])){
            //     right--;
            // }
            // else{
                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
                right--;
                left++;
            // }
        }
        String result = new String(letters);
        

        System.out.println("Result = "+result);
    }
}
