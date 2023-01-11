package class6;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {

        /*
        logical operator works with boolean(true,false)
        (!) means NOT: it reverse the condition.
        (||) means OR: combines 2 or more conditions and return true as long as 1 condi is true.
        will return to false if all condition is false.

         */
        // (!) NOT example:
        System.out.println(false);
        System.out.println(!false);
        boolean condition= !true;
        System.out.println(condition);
        /////////////////////////////////////////////////////////////
        boolean isRaining=true;
        if(!isRaining){
            System.out.println("Lets go for walk");
        }else{
            System.out.println("take umbrella");
        }
        ///////////////////////////////////////////////////////////
        // (||) OR with (equlas.ignorecase)==> (lower or upper case) example:
        String day="Monday";
        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("No class today");

        }else if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("Java class today");
        }else if(day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Tuesday")){
            System.out.println("Manual testing class");
        }else if(day.equalsIgnoreCase("Thursday")){
            System.out.println("Review day");
        }else{
            System.out.println("Wrong day entered");
        }
        //////////////////////////////////////////////////////////////
        // (&&) AND combines 2 or more conditions, it will return true if all conditions is true. Example:
        boolean underStandJava=true;
        boolean enjoyJava=true;
        if (underStandJava && enjoyJava){
            System.out.println("You get the job quickly");
        }else{
            System.out.println("You need to practice");
        }
        /////////////////////////////////////////////////////////////////
        // switch case example:
        Scanner input=new Scanner(System.in);
        String country=input.next();
        System.out.println("What is your country");

        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()){// converts the text to lowercase
            case"usa":
                System.out.println("Burgers");
                break;
            case"italy":
                System.out.println("Pasta");
                break;
            case"afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");

        }
        ///////////////////////////////////////////////////////////////////////////












    }
}
