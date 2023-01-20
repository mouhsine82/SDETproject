package HomwWork6;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Cars2DArrays {
    public static void main(String[] args) {
        /*
        Create 2D array of cars : american, german, korean, italian.
        Then retrieve all values from that array using 2 different loops
         */

        String[][] cars = {{"Ford", "Chevrolet", "Tesla"},
                {"Audi", "Porsche", "BMW"},
                {"Hyundai", "Kia", "Genesis"},
                {"Alfa Romeo", "Fiat", "Ferrari"}};

        System.out.println("******   FIRST LOOP   *********");
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("****   SECOND LOOP  ******");
       for (String[] brand:cars){
           System.out.println(Arrays.toString(brand));
       }


        }
    }

