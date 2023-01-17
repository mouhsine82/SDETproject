package HomeWork4;

import java.util.Scanner;

public class Hw4Task4 {
    public static void main(String[] args) {
/*
Write a program to ask a user to enter item they want to buy and the price of that item
. Every time user enters money accumulate the amount and tell the user how much is left to pay off.
If user give more money program should return a change. Whenever a user done with payments program should
say "Thank you for shopping!"
 */
        Scanner input=new Scanner(System.in);

        double moneyGiven;

        System.out.println("Enter the item name:");
        String itemName= input.nextLine();

        System.out.println("Enter the item price");
        double itemPrice=input.nextDouble();
        System.out.println("Your Total is: "+itemPrice);
        System.out.println("Please enter money given:");
        moneyGiven=input.nextDouble();

        if(moneyGiven<itemPrice){
            System.out.println("Please pay $"+ (itemPrice-moneyGiven)+" to pay off your due");
        }else{
            System.out.println("Your change is $ "+(moneyGiven-itemPrice));

        }
        System.out.println("Thank you for shopping");







    }
}
