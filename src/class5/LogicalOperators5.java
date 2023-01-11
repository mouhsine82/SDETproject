package class5;

import java.util.Scanner;

public class LogicalOperators5 {
    public static void main(String[] args) {

        // char data type for switch case and scanner.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your gender");
        char gender=input.next().charAt(0);


        switch (gender){

            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("Not specified");
        }










    }
}
