package JavaProjects;

import java.util.Scanner;

public class JPTask_2 {
    public static void main(String[] args) {

/*
2)Using Scanner create an array of countries. 
When an array is created, retrieve all values from it 
and while retrieving those values print capital for each country. 
(use 2 different loops).
 */

        Scanner input=new Scanner(System.in);
        
        String[] countries={"Morocco","France","Spain","Japan"};

        for (int i = 0; i < countries.length; i++) {
            System.out.println("PLease enter the capital of "+countries[i]+": ");
            String capital= input.next();
            System.out.println("The capital of "+countries[i]+" is: "+capital);
        }
        System.out.println("************************************");


       // for(String country=countries){


        }
        
        

        
    }

