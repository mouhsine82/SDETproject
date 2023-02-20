package class27ArrayList;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
       /*
       because we can't use primitive data type in ArrayList we use class instead see below
       byte=> class Byte
       short=> class Short
       int => class Integer
       long => class Long
       float=> class Float
       double=>class Double
       char=> class Character
       boolean=> class Boolean
       */


        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(15);
        numbers.add(34);
        numbers.add(56);
        numbers.add(10);
        numbers.add(89);
        numbers.add(59);
        System.out.println(numbers);
    }
}
