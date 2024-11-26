public class SecondLargest {

    public static void main(String[] args) {

        int[] num = {3, 5, 1, 6, 7, 3, 9, 8, 9};

        if (num.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];
            } else if (num[i] > secondLargest && num[i] < largest) {
                secondLargest = num[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second largest = " + secondLargest);
        }
    }
}
