package class11;

import java.util.Arrays;

public class D2Array {
    public static void main(String[] args) {

        int [][] matrix={{10,20,30},{45,55,66},{30,40,20,10,25}};

        System.out.println(matrix[2][4]); // will print 25 -->in this exp 2 is the 3rd bracket group and 4 is the # in that group.
        System.out.println(Arrays.toString(matrix[0])); //will print the whole complete 1st row

        for (int i = 0; i < matrix[0].length ; i++) {
            System.out.println(matrix[0][i]);

        }

        int[] arr=matrix[0];//getting complete 1st array from 2 D array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
