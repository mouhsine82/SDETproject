package HomeWork9;

public class Task3 {
    //3) Create a method that will print whether given String is palindrome or not.

    boolean Task3(String str ){

        String reversed = new StringBuilder(str).reverse().toString();
         if((str.equals(reversed))){
             return true;
         }else{
             return false;
         }
    }
    // Task3 tester
    public static void main(String[] args) {

        Task3 word=new Task3();
        System.out.println(word.Task3("deified"));
    }
}
