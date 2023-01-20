package HomwWork6;

public class EvenOdd2DArray {
    public static void main(String[] args) {

        /*
        Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
         Develop a program which will identify/print the even numbers only.
         */

        int[][] num = {{5, 8, 14, 20},
                {20, 38, 62, 10},
                {12, 48, 69, 90}};


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if(num[i][j]%2==0){
                    System.out.print(num[i][j]+" ");
                }
            }
            System.out.println();

        }

          }





        }



