/**
 * Program 4: Merge Two Sorted Integer Arrays into a Single Sorted Array
 */
public class MergeSortedArrays {

    public static int[] merge(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays and insert the smaller one
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        // Copy any remaining elements from array a
        while (i < a.length) {
            merged[k++] = a[i++];
        }

        // Copy any remaining elements from array b
        while (j < b.length) {
            merged[k++] = b[j++];
        }

        return merged;
    }

    public static void printArray(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9, 11};
        int[] array2 = {2, 4, 6, 8, 10};

        System.out.print("Array 1: ");
        printArray(array1);

        System.out.print("Array 2: ");
        printArray(array2);

        int[] result = merge(array1, array2);

        System.out.print("Merged  : ");
        printArray(result);
    }
}
