package com.syntaxReview3;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("*******Logical AND && *******");
       Boolean loginButtonDisplayed=true;
       boolean loginButtonClickable=false;

       if(loginButtonDisplayed && loginButtonClickable){
           System.out.println("Test case is passed");
       }else System.out.println("Test case failed");
        System.out.println("************Logical OR**************");

        boolean dashboard= false;
        String message="Welcome admin";

        if(dashboard || message.equals("Welcome admin")) {
            System.out.println("user is successfully login");
        }else{
            System.out.println("use is not login");
        }
        System.out.println("********Logical ! NOT ***********");

        boolean agreeCheckBoxSelected=true;
        if(!agreeCheckBoxSelected) {
            System.out.println("I am clicking on checkbox");
        }
        System.out.println("I am clicking on submit button");


    }

}
