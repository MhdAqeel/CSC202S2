public class BinaryConverter {
    public static void toBinary(int decimalNumber){
        int display = decimalNumber; // Store original for display
        StackArrayADT stack = new StackArrayADT(32); 
        if (decimalNumber == 0) {
            System.out.println("Binary representation: 0");
            return;
        }
        while(decimalNumber > 0){
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber /= 2;
        }
        System.out.print("Binary representation of " + display + " is : ");
        stack.display();
    }
    
    public static void main(String[] args) {
        toBinary(10);
        toBinary(0);
        toBinary(255);
        toBinary(84);
    }
}