package com.syntaxReview;

import java.util.Scanner;

public class Scanner_Review {
    public static void main(String[] args) {


        Scanner keyboard=new Scanner(System.in);

        System.out.println("Please enter your age");
        int age=keyboard.nextInt();// to capture int values
        System.out.println("Are you tired");
        boolean tired=keyboard.nextBoolean();// to capture boolean value
        System.out.println("Whats is your name");
        String name=keyboard.next();//to capture string until space

        System.out.println(age);
        System.out.println(tired);
        System.out.println(name);

    }
}
