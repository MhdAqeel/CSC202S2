import java.util.Scanner;

class DispalyFact{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int n = sc.nextInt();
		
		System.out.println("Factorial of " + n + "! is : " + factorial(n));
		sc.close();
	}
	
	static int factorial(int n){
		if (n == 0){
			return 1; 
		}
		return n*factorial(n-1);
	}
}
