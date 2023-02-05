package com.syntaxReview3;

public class ForLoop {
    public static void main(String[] args) {

        /*
        1- initialization
        2-condition
        3-if true code goes inside the loop body
        4- goes back to check the condition
        5-
         */

        for (int i = 1; i <=5; i++) { //
            System.out.println("hello "+i);
        }
        System.out.println("***********************");
        for(int a=0;a<8;a+=4){// this will execute 2 bye
            System.out.println("Bye");
        }
        System.out.println("***********************");
        for(int i=2;i>10;i++){ //condition is false 2 is not greater than 10 so no execution.
            System.out.println(i);
        }
        System.out.println("***********************");
        for(int j=3;j<10;j--){ //this will print infinite bcz it will decrement and became negative number and its less than 10.
            System.out.println(j);
        }






    }

}
