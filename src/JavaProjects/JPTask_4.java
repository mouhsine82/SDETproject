package JavaProjects;

import java.util.Arrays;

public class JPTask_4 {
    public static void main(String[] args) {
        /*
        4) Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.
         */
        int[][] mixNumbers={{22,33,65},{14,78,7},{9,11,30}};
        for (int i = 0; i < mixNumbers.length ; i++) {
            for (int j = 0; j < mixNumbers.length ; j++) {
                if(mixNumbers[i][j]%2==0){
                    System.out.println(mixNumbers[i][j]);

            }

            }

        }





    }
}
