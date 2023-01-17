package class9;

public class ArraysDemo {
    public static void main(String[] args) {
        /* bad approach to hold a lots of variables.
        String name="Younes";
        String name2="Anes";
        String name3="Ana";
        String name4="adil";
        String name5="Hassan";

         */
        // solution is Arrays.

        String [] names={"Younes","Anes","Ana","Adil","Hassan"}; //sames as above but in 1 line
        System.out.println(names[0]);// this will print the names that you want using numbers it start with 0 1 2 3 etc
        System.out.println(names[1]);
        System.out.println(names[500]);// error bcz there is no name on index number 500.
        // System.out.println(names[-5]); error because index can't be negative
        // write a loop to print all the names from array
        for (int i=0; i <=4; i++) {
            System.out.println(names[i]);

        }

    }
}
