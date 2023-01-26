package HomeWork7;

import java.util.Scanner;

public class HwTask3 {
    public static void main(String[] args) {
        /*
        3) Write a program that reads two people's first
     names and if they expecting boy or girl?
      Based on the input suggests a name for a baby:
      Example Output:
       Mom’s first name? Mary
      Dad’s first name? Daniel
       Boy or Girl? boy
      Suggested baby name: DANRY

           Example Output:
           Mom’s first name? Mary
          Dad’s first name? Daniel
           Boy or Girl? girl
           Suggested baby name: MAIEL
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter Mom's first name: ");
        String mom= input.next();
        System.out.println("Please enter Dad's first name: ");
        String dad=input.next();
        System.out.println("Are you expecting Boy or a Girl?");
        String baby=input.next();
        String babyName;

        if(baby.equalsIgnoreCase("boy")){
            babyName=dad.substring(0,dad.length()/2)+mom.substring(mom.length()/2).toUpperCase();
        }else{
            babyName=mom.substring(mom.length()/2)+dad.substring(dad.length()/2).toUpperCase();
        }
        System.out.println("You can name your child "+babyName.toUpperCase());











    }
}
