package HomeWork2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /*
        HomeWork: Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/)
         Based on operator provide the result to user.
         */
        Scanner input=new Scanner(System.in);

        double num1, num2, result;
        System.out.println("Please choose an operator: ( +, -, *, / )");
        char operator=input.next().charAt(0);
        System.out.println("Please enter 1st number:");
        num1= input.nextDouble();
        System.out.println("Please enter 2nd number:");
        num2= input.nextDouble();
        switch (operator){
            case'+':
                result=num1+num2;
                System.out.println(num1+" + "+num2+" = "+ result);
                break;
            case'-':
                result=num1-num2;
                System.out.println(num1+" - "+num2+" = "+ result);
                break;
            case '*':
                result=num1*num2;
                System.out.println(num1+" * "+num2+" = "+ result);
                break;
            case'/':
                result=num1/num2;
                System.out.println(num1+" / "+num2+" = "+ result);
            default:
                System.out.println("Invalid input");









        }







    }
}
