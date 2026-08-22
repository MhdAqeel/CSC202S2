import java.util.Scanner;
public class StringReverser {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        
        StackArrayADT stack = new StackArrayADT(input.length());
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            stack.push(c);
        }
        
        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()){
            int value = stack.pop();
            reversed.append((char)value);
        }
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed.toString());
    }
}
