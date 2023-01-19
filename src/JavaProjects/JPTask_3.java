package JavaProjects;

import java.util.Arrays;

public class JPTask_3 {
    public static void main(String[] args) {

        /*
        3) Create a 2D array of integer values. Print the sum of all numbers.
         */

         int[][] numbers={{10,20,30},{50,60,70},};

         int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println("Sum of all numbers is: "+sum);

    }
}
