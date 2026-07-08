public class BubbleSort {
    public static void main(String[] args) {
        ArrayADT numbers = new ArrayADT(5);
        numbers.insert(0, 6);
        numbers.insert(1, 7);
        numbers.insert(2, 4);
        numbers.insert(3, 2);
        numbers.insert(4, 8);

        System.out.print("Before : ");
        numbers.printArray();

        boolean swaped;
        for (int i = 0; i < numbers.getSize() - 1; i++) {
            swaped = false;
            for (int j = 0; j < numbers.getSize() - 1 - i; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.update(j, numbers.get(j + 1));
                    numbers.update(j + 1, temp);
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }

        System.out.print("After : ");
        numbers.printArray();
    }
}
