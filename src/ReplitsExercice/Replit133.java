package ReplitsExercice;

public class Replit133 {
    /*
    Create a static method with the following specs:
Returns:an integer
Name:countA
Parameters:a String called s
Purpose:count the number of occurrences of 'a' or 'A' within s
Examples:
countA("aaa") ==> 3
countA("aaBBdf8k3AAadnklA") ==> 6
     */


     static int  countA(String s) {
         int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
         return count;
    }

        //test case below (dont change):
        public static void main (String[]args){
            System.out.println(countA("aaA")); //3
            System.out.println(countA("aaBBdf8k3AAadnklA")); //6
        }
    }



