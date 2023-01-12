package class7;

public class ForLoops {
    public static void main(String[] args) {
        //print number from 0 to 9.
        // this how we write +For loops+ (initialize;condition;increment or decrement)
        int number = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("************************");

        // using a for loop print odd numbers from 1 to 20.
        // 1st way easy:

        for (int i = 1; i < 20; i += 2) {
            System.out.println(i);
        }
         /*
         or 2nd way:
         for(int i=0;i<10;i++) {
         if(i%2!=0){
         sout (i)
          */
        // write this code 1 2 4 5 7 8 10 11 13 14 16 17 19;
        for (int i = 0; i < 20; i++) {
            if (i % 3 != 0) { // this condition divides all the numbers by 3 and checks if the remainder is not 0.
                System.out.println(i);
            }
        }
        System.out.println("**********************");
        // table of five multiplication.
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));

        }
        System.out.println("*******************");
        //table of 3
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + (3 * i));


        }

    }
}










