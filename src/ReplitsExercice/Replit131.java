package ReplitsExercice;

public class Replit131 {
    /*
    Write a method header on line two with the following specs:
Returns:a String
Name:thirdLetter
Parameters:a String called s
Then complete the method by programming the following behavior
Returns every 3rd letter of the String s,
starting from the first letter.
See below examples.
Examples:thirdLetter("hello there") ==> "hltr"
     */
    public static String thirdLetter(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i += 3) {
            result += s.charAt(i);
        }
        return result;
    }

        //test case below (dont change):

        public static void main (String[]args){

            System.out.println(thirdLetter("hello there")); //"hltr"
            System.out.println(thirdLetter("technology")); //"thly"
        }
    }



