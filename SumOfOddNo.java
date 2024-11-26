import java.util.*;

public class SumOfOddNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int size = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers.add(scanner.nextInt());
        }

        // Your code here
        // Hint: Use Stream API to filter and sum odd numbers
        int sum = numbers.stream()
                         .filter(n->n%2!=0)
                         .mapToInt(Integer::intValue)
                         .sum();

        System.out.println("Sum = "+sum);

        

    }
}
