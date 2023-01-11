package HomeWork2;

import java.util.Scanner;

public class CountryHw {
    public static void main(String[] args) {
        /*
        Ask user to enter their country and capture it. Once values are captured print which language user speaks.
         */
        Scanner input=new Scanner(System.in);

        String lang1="Arabic", lang2="French", lang3="English", lang4="Chinese", lang5="Korean";
        System.out.println("Please enter your country: ");
        String country=input.next();

        switch (country){
            case "Morocco":
                System.out.println("Your first language is "+lang1);
                break;
            case "France":
                System.out.println("Your first language is "+lang2);
                break;
            case "USA":
                System.out.println("Your first language is "+lang3);
                break;
            case "China":
                System.out.println("Your first language is "+lang4);
                break;
            case "South Korea":
                System.out.println("Your first language is "+lang5);
                break;
            default:
                System.out.println("Invalid country!!");






        }




    }
}
