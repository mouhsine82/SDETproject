package HomeWork8;

public class StringSplit {
    public static void main(String[] args) {
        /*
        3) You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
         How would you find out how many sentences are in that String?
         */

        String str="Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] strArr = str.split("[?]");
        System.out.println(strArr.length);
        System.out.println(str.split("[?]").length); // or only this line to solve the question




    }
}
