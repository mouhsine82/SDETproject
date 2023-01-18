package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int[] numbers=new int[5];
        /*
        below code manually store numbers in array
        numbers[0]=40;
        numbers[1]=50;
        numbers[2]=60;
        numbers[3]=70;
        numbers[4]=80;
        */
        /* below code to take numbers from user and store them in an array but too long code.
       numbers[0]=input.nextInt();
        numbers[1]=input.nextInt();
        numbers[2]=input.nextInt();
        numbers[3]=input.nextInt();
        numbers[4]=input.nextInt();
     */
        // below uses a normal for loop to ask the user from numbers and store them in the array
        // best way for using Scanner and Arrays.

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= input.nextInt();

        }
        System.out.println(Arrays.toString(numbers)); // to print all the element without for loop




    }
}
