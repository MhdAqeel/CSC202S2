import java.util.Scanner;
public class Fibonacci {
    
    static int findFib(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    int a = 0;
    int b = 1;

    for (int i = 2; i <= n; i++) {
        int temp = b;
        b = a + b;
        a = temp;
    }

    return b;
    }

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
        System.out.println("Enter a number: ");
        int x = sc.nextInt();

        System.out.println("fib: " + findFib(x));

        System.out.println("recursive: " + recursiveFib(x));
    }
}
