public class SelectionSort {
    public static void main(String[] args) {
        ArrayADT numbers = new ArrayADT(5);
        numbers.insert(0, 6);
        numbers.insert(1, 7);
        numbers.insert(2, 4);
        numbers.insert(3, 2);
        numbers.insert(4, 8);

        System.out.print("Before : ");
        numbers.printArray();

        for (int i = 0; i < numbers.getSize() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.getSize(); j++) {
                if (numbers.get(j) < numbers.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = numbers.get(i);
                numbers.update(i, numbers.get(minIndex));
                numbers.update(minIndex, temp);
            }
        }

        System.out.print("After : ");
        numbers.printArray();
    }
}
