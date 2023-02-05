package ReplitPractice;

public class Practice {

    /*
    Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false

( Return false if one or both given numbers are not even)
     */
    boolean evenNum(int num1, int num2) {

        if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }




        public static void main (String[]args){

            Practice ev = new Practice();
            System.out.println(ev.evenNum(3, 4));
        }
    }




