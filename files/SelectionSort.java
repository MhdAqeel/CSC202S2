/**
 * Program 6: Sort an Integer Array in Ascending Order Using Selection Sort
 *
 * How it works:
 *   - Divide the array into a sorted region (left) and an unsorted region (right).
 *   - In each pass, find the minimum element in the unsorted region.
 *   - Swap it with the first element of the unsorted region,
 *     extending the sorted region by one position.
 *   - Repeat until the entire array is sorted.
 *
 * Time complexity: O(n²) in all cases
 * Advantage over Bubble Sort: makes at most O(n) swaps (useful when writes are costly)
 */
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in arr[i..n-1]
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum with the first element of the unsorted region
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11, 90, 38};

        System.out.print("Before sorting: ");
        printArray(numbers);

        selectionSort(numbers);

        System.out.print("After sorting:  ");
        printArray(numbers);
    }
}
