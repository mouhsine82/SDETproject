package HomeWork2;

import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {
        /*
        Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =”Summer”.
At the end of the program we should see output as “You were born __”
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter your Birth month: ");
        String month=input.next();
        String season1="Winter";
        String season2="Spring";
        String season3="Summer";
        String season4="Autumn";


        if(month.equals("January")||month.equals("February")||month.equals("December")){
            System.out.println("You were born in "+season1);
        }else if(month.equals("March")||month.equals("April")||month.equals("May")){
            System.out.println("You were born in " + season2);
        }else if(month.equals("June")||month.equals("July")||month.equals("August")){
            System.out.println("You were born in " + season3);
        }else if(month.equals("September")||month.equals("October")||month.equals("November")){
            System.out.println("You were born in " + season4);
        }else{
            System.out.println("Please Enter valid month");
        }










    }
}
