public class Duplicate {
    public static void removeDuplicates(ArrayADT numbers) {
        for (int i = 0; i < numbers.getSize(); i++) {
            for (int j = i + 1; j < numbers.getSize(); j++) {
                if (numbers.get(i) == numbers.get(j)) {
                    numbers.delete(j);
                    j--; 
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayADT numbers = new ArrayADT(10);
        numbers.insert(0, 5);
        numbers.insert(1, 2);
        numbers.insert(2, 3);
        numbers.insert(3, 1);
        numbers.insert(4, 5);
        numbers.insert(5, 4);
        numbers.insert(6, 6);
        numbers.insert(7, 8);
        numbers.insert(8, 5);
        numbers.insert(9, 1);

        System.out.print("Array before : ");
        numbers.traverse();

        removeDuplicates(numbers);

        System.out.print("Array after : ");
        numbers.traverse();
    }
}
