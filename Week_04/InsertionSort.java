public class InsertionSort {
    public static void sort(ArrayADT arr) {
            for (int i = 1; i < arr.getSize(); i++) {
                int key = arr.get(i);
                int j = i - 1;

                while (j >= 0 && arr.get(j) > key) {
                    arr.set(j + 1, arr.get(j));
                    j--;
                }
                arr.set(j + 1, key);
            }
        }

    public static void main(String[] args) {
        ArrayADT arr = new ArrayADT(6);

        arr.insert(0, 5);
        arr.insert(1, 2);
        arr.insert(2, 9);
        arr.insert(3, 1);
        arr.insert(4, 7);
        arr.insert(5, 3);

        System.out.print("Before sorting: ");
        arr.traverse();

        sort(arr);

        System.out.print("After sorting: ");
        arr.traverse();
    }
}