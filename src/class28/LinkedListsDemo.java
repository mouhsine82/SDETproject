package class28;

import java.util.LinkedList;

public class LinkedListsDemo {
    public static void main(String[] args) {

        LinkedList<String> names=new LinkedList<>();
        names.add("MO");
        names.add("YO");
        names.add("AN");
        names.add("HY");
        System.out.println(names);

        for(String str:names){
            System.out.println(str);
        }

    }
}
