package com.syntaxReview;

public class IfStatment {
    public static void main(String[] args) {

        /* is statement is conditional statement
        if(boolean condition){ if the condition is true it wil execute what between the curley brackets(block of code)
        }
         */

        int day=1;
        if(day==1);{
            System.out.println("It is the first day of the month");
        }

        String month="December";
        if(month.equals("December")) { // with string, we use variable.equals we cant use relational sign
            System.out.println("Its xmas");
        }


        boolean evening=true;
        if(evening){
            System.out.println("I might have class");
        }




    }
}
