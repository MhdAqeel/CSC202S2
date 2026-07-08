public class MinimumValue {
    public static void main(String[] args) {
        ArrayADT numbers = new ArrayADT(5);
        numbers.insert(0, 6);
        numbers.insert(1, 7);
        numbers.insert(2, 4);
        numbers.insert(3, 2);
        numbers.insert(4, 8);

        
        int minValue = numbers.get(0); 
        for (int i = 1; i < numbers.getSize(); i++) {
            if (numbers.get(i) < minValue) {
                minValue = numbers.get(i);
            }
        }
        System.out.println("The minimum value in the array is: " + minValue);

    }

}
