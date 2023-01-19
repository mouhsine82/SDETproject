package class11;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {

        int [][] matrix={{10,20,30},{45,55,66},{30,40,20,10,25}};

        //write a loop to print all the elements from this 2D array (Nested loop)

        for (int i = 0; i < matrix.length ; i++) { //matrix.length tell us how many 1 D arrays are present in the 2D array.
            for (int j = 0; j < matrix[i].length ; j++) { // matrix[i].length the size of each 1 D array.
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();

        }
    }
}
