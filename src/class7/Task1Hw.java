package class7;

public class Task1Hw {
    public static void main(String[] args) {

        // Task1 from HW.
        boolean workDay = true;
        int day = 1;
        while (workDay) {
            if (day <= 5) {
                System.out.println("I need a day off");
            } else {
                System.out.println("I do not need a day off anymore");
                workDay = false;
            }
            day++;  // it is equal to day=day+1 day+=1



        }
    }
}
