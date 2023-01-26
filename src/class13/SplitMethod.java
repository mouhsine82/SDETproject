package class13;

public class SplitMethod {
    public static void main(String[] args) {


        String str = "I like java. I write a lot of code daily. I am from batch 15";
        String[] strArr = str.split("[.?!]"); // . ? ! to specify the end of the sentence
        System.out.println(strArr.length);
        System.out.println(strArr[0].trim());// will print first sentence
        //whenever we are working with arrays we use the length and whenever we are working with Strings
        // we use the length()

    }
}
