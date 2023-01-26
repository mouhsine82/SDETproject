package HomeWork8;

public class StringPalindrome {
    public static void main(String[] args) {

        /*
        5) How would you check if String is palindrome or not? aba=> true
         Abbc =>false
         */


        String input = "deified";
        String reversed = new StringBuilder(input.toLowerCase()).reverse().toString();
        if (input.toLowerCase().equals(reversed)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }

    }
}
