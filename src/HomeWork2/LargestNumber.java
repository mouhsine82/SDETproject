package HomeWork2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
/*
)Write a program to find largest number among three numbers
using nested if provided by a user (numbers must be distinct)
 */
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter three numbers:");
        int num5 = input.nextInt();
        int num6 = input.nextInt();
        int num7 = input.nextInt();

        if (num5 > num6 && num5 > num7) {
            System.out.println("The largest number is " + num5);
        }
        if (num6 > num5 && num6 > num7){
            System.out.println("The largest number is " + num6);

        }else if (num7>num5 && num7>num6)
            System.out.println("The largest number is " + num7);
    }

}




