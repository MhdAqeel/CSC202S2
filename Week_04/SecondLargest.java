public class SecondLargest {
    public static int findSecondLargest(ArrayADT numbers) {
        boolean swaped;
            for (int i = 0; i < numbers.getSize() - 1; i++) {
                swaped = false;
                for (int j = 0; j < numbers.getSize() - 1 - i; j++) {
                    if (numbers.get(j) > numbers.get(j + 1)) {
                        int temp = numbers.get(j);
                        numbers.set(j, numbers.get(j + 1));
                        numbers.set(j + 1, temp);
                        swaped = true;
                    }
                }
                if (!swaped) {
                    break;
                }
            }
        return numbers.get(numbers.getSize()-2);
    }

    public static void main(String[] args) {
        ArrayADT numbers = new ArrayADT(5);
        numbers.insert(0, 5);
        numbers.insert(1, 7);
        numbers.insert(2, 9);
        numbers.insert(3, 4);
        numbers.insert(4, 6);

        System.out.println("Second Largest number of the array is : "+findSecondLargest(numbers));
    }
}
