public class SecondLargestTest {
    private static ArrayADT createArray(int... values) {
        ArrayADT numbers = new ArrayADT(values.length);

        for (int i = 0; i < values.length; i++) {
            numbers.insert(i, values[i]);
        }

        return numbers;
    }

    private static void runTest(String testName, ArrayADT numbers, int expected) {
        int actual = SecondLargest.findSecondLargest(numbers);
        System.out.println(testName + " -> expected: " + expected + ", actual: " + actual);
    }

    public static void main(String[] args) {
        runTest("Test case 1", createArray(5, 7, 9, 4, 6), 7);
        runTest("Test case 2", createArray(10, 3, 8, 12, 1), 10);
    }
}