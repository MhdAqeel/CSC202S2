/**
 * Program 1: Find the Minimum Value in an Integer Array
 */
public class MinValue {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {34, 7, 23, 32, 5, 62, 1, 88, 15};

        System.out.print("Array: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();

        int min = findMin(numbers);
        System.out.println("Minimum value: " + min);
    }
}
