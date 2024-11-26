import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class MergeArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for the second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }


        ArrayList<Integer> merged = new ArrayList<>();

        for(int i : arr1){
            merged.add(i);
        }
        for(int i : arr2){
            merged.add(i);
        }

        Collections.sort(merged);

        

        

        

    }
    
}
