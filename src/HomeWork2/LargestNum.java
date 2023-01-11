package HomeWork2;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        /*
         Write a program to find largest of three double values using if-else..if
         and logical operators provided by a user (numbers must be distinct)
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter 3 double values:");
        double num1= input.nextDouble();
        double num2= input.nextDouble();
        double num3= input.nextDouble();
        if(num1>num2 && num1>num3){
            System.out.println("The largest number is "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("The largest number is "+num2);
        }else if(num3>num1 && num3>num2){
            System.out.println("The largest number is "+num3);
        }









    }
}
