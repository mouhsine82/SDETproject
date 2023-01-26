package HomeWork7;

import java.util.Scanner;

public class any {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Mom’s first name?");
        String mumName=input.next();
        System.out.println("Dad’s first name?");
        String dadName=input.next();
        System.out.println("Boy or Girl?");
        String babyGender=input.next();
        String babyName;
        int midOfdadName=dadName.length()/2;
        int endOfdadName=dadName.length();
        int midOfMumname=mumName.length()/2;
        int endofMumname=mumName.length();

        // System.out.println(midOfdadName+" "+endOfdadName);
        //System.out.println(midOfMumname+ " "+endofMumname);

        if(babyGender.equalsIgnoreCase("boy")){


            babyName=dadName.substring(0,midOfdadName)+mumName.substring(midOfMumname,endofMumname);

            System.out.println("Suggested baby name: "+babyName.toUpperCase());

        }else{
            babyName=mumName.substring(0,midOfMumname)+dadName.substring(midOfdadName,endOfdadName);

            System.out.println("Suggested baby name: "+babyName.toUpperCase());
        }
    }
}
