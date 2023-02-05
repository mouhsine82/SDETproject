package ReplitPractice;

public class ReverseWithStringBuilder {
    public static void main(String[] args) {

        String input = "Hello Friends";
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        String reversed = sb.toString();
        System.out.println(reversed);
    }
}
