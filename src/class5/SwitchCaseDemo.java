package class5;

public class SwitchCaseDemo {
    public static void main(String[] args) {

       /* int day = 10;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong day");
        }*/

        // other way to do the above code. it's faster without the (if & else if) condi by using switch case.
        //debugging will jump to the right statement.
        // also can click on yellow bulb if you want switch to if statement and vice versa.
        // breaks; mean to used to break loop or switch statement.


        // int data type example in switch case
        int day=1;
        switch (day){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day");


        }





    }
}
