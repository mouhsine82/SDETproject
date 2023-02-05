package com.syntaxReview3;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int i=1;
        while (i<=4){
            System.out.println("Hello");
            i++;
        }
        System.out.println("**********************");

        Scanner input=new Scanner(System.in);
        System.out.println("Are you tired?");
        boolean tired=input.nextBoolean();
        while(!tired){
            System.out.println("This is great");
            System.out.println("Lets study");
            System.out.println("Are you tired");
            tired=input.nextBoolean();
        }



    }
}
