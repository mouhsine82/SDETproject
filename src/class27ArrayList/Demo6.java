package class27ArrayList;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {


        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);

        System.out.println(booleans.get(0));
        System.out.println(booleans.get(3));
        System.out.println(booleans.size());// to print the size of the ArrayList

        // using loop
        for(int i=0; i<booleans.size();i++){ // to print all the elements from ArrayList
            System.out.println(booleans.get(i));
        }
      // using while loop
        int i=0;
        while (i<booleans.size()){
            System.out.println(booleans.get(i));
            i++;
        }
    }
}
