public class ReverseArray {
    public static void main(String [] args){
        ArrayADT numbers = new ArrayADT(5);
        numbers.insert(0, 6);
        numbers.insert(1, 7);
        numbers.insert(2, 4);
        numbers.insert(3, 2);
        numbers.insert(4, 8);

        System.out.print("Before : ");
        numbers.printArray();

        int left = 0;
        int right = numbers.getSize() - 1;

        while (left < right) {
            int temp = numbers.get(left);
            numbers.update(left, numbers.get(right));
            numbers.update(right, temp);
            left++;
            right--;
        }
        System.out.print("After : ");
        numbers.printArray();
    }
}
