package ReplitsExercice;

public class Replit140 {
    /*
    Create the maxLength method that will accept String array of words and return the word with the largest length.
Method should visible only within same package!
**Expected Output:**
"this is long"
     */

    public static String maxLength(String[] words) {
        int maxLength = 0;
        String longestWord = "";
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"


    }
}

