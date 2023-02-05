package class17;

public class Task2 {
    /*
    2) Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    public static String reverseStr(String input) {
        new StringBuilder(input).reverse().toString();
        return input;
    }



//static methods can be called by just writing the nameclass.methodename.
    public static void main(String[] args) {

        reverseStr("Sunday");// if we are within the same class we don't need the class name as well
    }
}
