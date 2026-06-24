import java.util.Scanner;
public class Fibonacci {
    static int recursiveFib(int n){
        if(n == 0){
            return 0; 
        }
        if (n == 1){
            return 1;
        }
        return recursiveFib(n-1) + recursiveFib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int x = sc.nextInt();
        sc.close();
        if(x < 0){
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci of " + x + " is: " + recursiveFib(x));
        }
    }
}
