

public class SameOrder {
    public static boolean isSameOrder(ArrayADT numbers1, ArrayADT numbers2) {
        if (numbers1.getSize() != numbers2.getSize()) {
            return false;
        }
        for (int i = 0; i < numbers1.getSize(); i++) {
            if (numbers1.get(i) != numbers2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayADT numbers1 = new ArrayADT(5);
        numbers1.insert(0, 5);
        numbers1.insert(1, 7);
        numbers1.insert(2, 9);
        numbers1.insert(3, 4);
        numbers1.insert(4, 6);
        System.out.println();

        ArrayADT numbers2 = new ArrayADT(5);
        numbers2.insert(0, 5);
        numbers2.insert(1, 7);
        numbers2.insert(2, 9);
        numbers2.insert(3, 4);
        numbers2.insert(4, 6);
        System.out.println();

        ArrayADT numbers3 = new ArrayADT(5);
        numbers3.insert(0, 5);
        numbers3.insert(1, 2);
        numbers3.insert(2, 9);
        numbers3.insert(3, 4);
        numbers3.insert(4, 6);
        System.out.println();

        ArrayADT numbers4 = new ArrayADT(6);
        numbers4.insert(0, 5);
        numbers4.insert(1, 7);
        numbers4.insert(2, 9);
        numbers4.insert(3, 4);
        numbers4.insert(4, 6);
        numbers4.insert(5, 10);
        System.out.println();

        numbers1.traverse();
        numbers2.traverse();
        System.out.println("Are the two arrays in the same order? " + isSameOrder(numbers1, numbers2));
        System.out.println();
        numbers1.traverse();
        numbers3.traverse();
        System.out.println("Are the two arrays in the same order? " + isSameOrder(numbers1, numbers3));
        System.out.println();
        numbers2.traverse();
        numbers4.traverse();
        System.out.println("Are the two arrays in the same order? " + isSameOrder(numbers2, numbers4));

    }
    
}
