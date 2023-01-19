package JavaProjects;

public class JPTask_5 {
    public static void main(String[] args) {
        /*
        5)Create a 2D array of integers. Develop a program which
        will calculate the sum of  even and odd numbers for that array.
         */
        int evenSum=0;
        int oddSum=0;
        int [][] arr={{11,22,6},{10,3,9},{25,22,18}};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i][j]%2==0) {
                    evenSum += arr[i][j];
                }else if(arr[i][j]%2!=0){
                        oddSum+=arr[i][j];
                    }
                }
            }
        System.out.println("The Sum of even numbers is: "+evenSum);
        System.out.println("The sum of odd numbers is: "+oddSum);

        }

    }

