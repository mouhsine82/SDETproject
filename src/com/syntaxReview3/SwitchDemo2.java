package com.syntaxReview3;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter favorite browser:");
        String browser=input.nextLine();

        switch (browser.toLowerCase()){
            case"chrome":
                System.out.println("Test case executed in "+browser);
                break;
            case"safari":
                System.out.println("Test case executed in "+browser);
                break;
            case"microsoft edge":
                System.out.println("Test case executed in "+browser);
                break;
            default:
                System.out.println("Browser is unknown");







        }




    }
}
