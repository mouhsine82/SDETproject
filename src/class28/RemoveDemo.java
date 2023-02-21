package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {
        // removing or adding or changing the size of element using loop using Iterator

        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Dada");
        // it does not work in java 9 and below
        var name="hjfhdh";
        var c='c';
        var f=12.3;  // var keyword used instead of using data types

        //Iterator<String> iterator= words.iterator();

//        while (iterator.hasNext()){   this is the long way it works from 6 to java 19
//            String s= iterator.next();
//            if(s.endsWith("a")){
//                iterator.remove();
//            }
//        }

          words.removeIf(s -> s.endsWith("a")); // this is the shortcut to remove element from ArrayList works in java 8 and newer
        System.out.println(words);

    }
}
