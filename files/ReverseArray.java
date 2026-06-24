/**
 * Program 2: Reverse the Order of Elements in an Integer Array
 */
public class ReverseArray {

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // Swap elements at left and right pointers
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void printArray(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Original array: ");
        printArray(numbers);

        reverse(numbers);

        System.out.print("Reversed array: ");
        printArray(numbers);
    }
}
