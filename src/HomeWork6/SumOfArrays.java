package HomeWork6;

public class SumOfArrays {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
         Print the sum of all numbers.
         */

        int[][] numbers={{4,10,54},
                         {34,12,7},
                         {98,12,65}};


        int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                sum = sum + numbers[i][j];

            }
        }

        System.out.println("The Sum of all numbers is: "+sum);
    }
}
