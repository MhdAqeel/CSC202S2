import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int x = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            
            int multiple = x * i;
            
            System.out.println(x + " x " + i + " = " + multiple);
        }
        sc.close();


    }
    

}
