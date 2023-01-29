package com.syntaxReview1;

public class IfElseIf {
    public static void main(String[] args) {

        /* when we have more condition to test
        if(boolean condition){
        code A
        } else if(boolean condition){
        code B
        } else if (boolean condition){
        code C
        }
         */

       int HW=30;
       if(HW>25){
           System.out.println("Great job");

       }else if (HW>20){
           System.out.println("Good job");

       }else if (HW>10){
           System.out.println("Ok job");

       }else if (HW>5){
           System.out.println("Not good job");
       }

        System.out.println("=================================================");

       String browser="opera";
       if(browser.equals("chrome")){
           System.out.println("Test cases on chrome");

       }else if(browser.equals("safari")){
           System.out.println("Test cases on safari");

       }else if(browser.equals("firefox")){
           System.out.println("Test cases on firefox");

       }else {
           System.out.println("browser not supported");// when none of the condition sre true, code comes to else block
       }






    }
}
