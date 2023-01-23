package class12;

public class StringDemo11 {
    public static void main(String[] args) {

        String str="Send it to support channel. more java";
        String newStr=str.substring(5);
        System.out.println(newStr); //this will print only letters after 5th index above case will ignor (send) and print the rest
        System.out.println(str.substring(0,26));  // or you can specify starting point to ending point (0,27)
    }
}
