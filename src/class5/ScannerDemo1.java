package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*Scanner -->Name of the class
        scan is just a variable
        = --> assignment operator
        System.in --> tells the computer we want to read the data from keyboard.
         */
        System.out.println("Please Enter your age");
        int age = scan.nextInt();
        System.out.println("You are " + age + " years old");
        System.out.println("Please Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Your weight is " + weight + " kgs");
//        System.out.println("PLease Enter your gender");
//        char gender=scan.next().charAt(0);//char type of input
        System.out.println("Please enter your name");
        String name = scan.next();//when we have to take only 1 word as input
        System.out.println("Your name is " + name);

        scan.nextLine();// trick to make nextLine method work after we have used any other from Scanner class
        System.out.println("Please enter your full name");
        String fullName = scan.nextLine();
        System.out.println("Your full name is " + fullName);

    }
}


