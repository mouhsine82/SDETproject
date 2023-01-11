package com.syntaxReview;

public class NestedIf {
    public static void main(String[] args) {

        /* nested if is 1 statement inside another if statement
        when we have 1 condition that depends on another
         */

        boolean vaccine=true;
        int dose=2;

        if(vaccine){ //outer if
            System.out.println("How many doses you have?");

            if(dose==1){ // inner if always depend on outer if
                System.out.println("You need a 2nd shot");
            }else{
                System.out.println("You are fully vaccinated");
            }
        }else {
            System.out.println("I do not have vaccine");
        }





    }
}
