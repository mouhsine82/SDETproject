package HomeWork12;

public class Replit132 {
    /*
    Complete the reduce10 method by making it subtract 10 from every element of the double array nums.
The method should static and it should return a new 2D array object
Print values from new array in the format below
input
1 2 3 4
4 5 6 7
1 3 5 7
**Expected Output:**
-9 -8 -7 -6
-6 -5 -4 -3
-9 -7 -5 -3
*/


    //create method reduce10 here
    public static double[][] reduce10(double[][] nums) {
        int rows = nums.length;
        int cols = nums[0].length;
        double[][] newNums = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newNums[i][j] = nums[i][j] - 10;
            }
        }
        return newNums;
    }
}






