import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

       List<Integer> lst = Arrays.stream(arr)
                                 .distinct()
                                 .boxed()
                                 .collect(Collectors.toList());

                                 
        System.out.println("Result = "+lst);



    }
}