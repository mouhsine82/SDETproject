package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {

        /*

         */
        int[] arr = {10, 13, 20, 25, 45, 50};
        // arr[1]=0 this is how to update a single element in an array.
        //print only the odd numbers from this array with the help of normal for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);

            }
        }
        System.out.println("*********************************");


        // replace all the odd numbers in the arrays with the help of normal loop

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                arr[i]=0; //shortcut to update an element in an array (this exp: updating odd # with o)
            }

        }
        System.out.println("After replacing all odd numbers with zero");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}
