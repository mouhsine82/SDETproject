package HomeWork8;

public class StringSentence {
    public static void main(String[] args) {
        /*
        1) Create a String that will hold a sentence. Write a program to get a new String without any spaces.
         */

        String str="My name is Mouhsine and I love java";
        String newStr=str.replaceAll(" ","");
        System.out.println(newStr);



    }
}
