package HomeWork2;

import java.util.Scanner;

public class GradeExplaination {
    public static void main(String[] args) {
        /*
        Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average,
        D-Bad, any other grade --> Not Acceptable.
         At the end your program should print which grade was entered by a user with explanation.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your grade:");
        char grade=input.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println(grade+" is Excellent grade");
                break;
            case 'B':
                System.out.println(grade+" is Good grade");
                break;
            case 'C':
                System.out.println(grade+" is Average grade");
                break;
            case 'D':
                System.out.println(grade+" is Bad grade");
                break;
            default:
                System.out.println(grade+" is Not Acceptable");
        }





    }
}
