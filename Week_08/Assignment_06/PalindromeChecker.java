public class PalindromeChecker{

    public static boolean isPalindrome(String str){
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StackGenaricListADT<Character> stack = new StackGenaricListADT<>();
        for(int i=0; i<cleanedStr.length(); i++){
            stack.push(cleanedStr.charAt(i));
        }
        for(int i=0; i<cleanedStr.length(); i++){
            if(cleanedStr.charAt(i) != stack.pop()){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        String str = "racecar";
        if(isPalindrome(str)){
            System.out.println(str + " is a palindrome.");
        }
        else{
            System.out.println(str + " is not a palindrome.");
        }
        String str2 = "parrot";
        if(isPalindrome(str2)){
            System.out.println(str2 + " is a palindrome.");
        }
        else{
            System.out.println(str2 + " is not a palindrome.");
        }
        String str3 = "A man, a plan, a canal: Panama";
        if(isPalindrome(str3)){
            System.out.println(str3 + " is a palindrome.");
        }
        else{
            System.out.println(str3 + " is not a palindrome.");
        }
    }
}