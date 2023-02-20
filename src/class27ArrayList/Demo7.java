package class27ArrayList;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("MO");
        names.add("YO");
        names.add("HY");
        names.add("Anes");
        names.add("Jon");
        names.add("Mouad");
        System.out.println(names.contains("Smith"));// will print false coz "Smith" not available in the ArrayList
        System.out.println(names);

        names.remove("MO"); // to remove an element from Arraylist
        System.out.println(names);

        names.set(0,"Mouhsine"); // this Replaces MO with Mouhsine.
        System.out.println(names);

        System.out.println(names.indexOf("Mouad"));// this will tell you which index the names is (location)
    }
}
