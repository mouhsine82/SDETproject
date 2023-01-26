package HomeWork6;

import java.util.Arrays;

public class GroceryList {
    public static void main(String[] args) {

        /*
        3) Using 2D array create a grocery list.
      Inside you should have an array of veggies, fruits, dairy and sweets.
       Retrieve all values from that array using 2 different loops
         */

        String[][] groceryList={{"Tomatoes","Carrots","Onions"},
                {"Kiwi","Apricot","Orange"},
                {"Milk","Yogurt","Cheese"},
                {"Donuts","Chocolate","Cake"}};

        System.out.println("****** FIRST LOOP *********");
        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j <groceryList[i].length ; j++) {
                System.out.print(groceryList[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("******  SECOND LOOP ********");

        for (String[] list:groceryList){
            System.out.println(Arrays.toString(list));
        }




    }
}
