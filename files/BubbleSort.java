/**
 * Program 5: Sort an Integer Array in Ascending Order Using Bubble Sort
 *
 * How it works:
 *   - Repeatedly step through the array comparing adjacent elements.
 *   - Swap them if they are in the wrong order.
 *   - After each full pass the largest unsorted element "bubbles up"
 *     to its correct position at the end.
 *   - The early-exit flag stops the algorithm as soon as the array
 *     is sorted, avoiding unnecessary passes.
 *
 * Time complexity: O(n²) worst/average case, O(n) best case (already sorted)
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;                 // Early-exit optimisation
            for (int j = 0; j < n - 1 - i; j++) {  // Last i elements already sorted
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;   // No swaps → array is already sorted
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

        bubbleSort(numbers);

        System.out.print("After sorting:  ");
        printArray(numbers);
    }
}
