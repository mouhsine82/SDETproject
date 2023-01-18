package class10;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {

       // 2 D array which can hold 3 one D arrays
        // each of size 3
        String[][] train1=new String [3][3];

        String [] cabin0={"Anes","Younes","Mouhsine"};
        String [] cabin1={"Hassan","Adil","Mouad"};
        String [] cabin2={"HY","Karima","Saadia"};


        train1[0]=cabin0;
        train1[1]=cabin1;
        train1[2]=cabin2;

        // in the first [] we specify the address of 1st D array
        // in the second [] we specify the address of the 2nd D array
        System.out.println(train1[1][2]); // will print Mouad.
        System.out.println(train1[2][1]); // will print Karima
        System.out.println(train1[1][1]); // will print Adil
        System.out.println(train1[0][1]); // will print Younes
        System.out.println(Arrays.toString(train1[0])); //this will print the whole array store in 0 row









    }
}
