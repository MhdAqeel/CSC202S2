import java.util.Scanner;

public class Reverce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        int length = words.length;

        System.out.println("Reversed sentence: ");

        for (int i = length-1 ; i>=0 ; i--){
            System.out.print(words[i] + " ");
        }

        sc.close();
    }
}
