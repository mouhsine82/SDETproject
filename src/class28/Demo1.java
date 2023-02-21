package class28;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Dada");
//       // remove all the elements from this list which ends with letter a
//        for(String s :words){  // this can't work because we can't remove elements at run time(Concurrent modification)
//            if(s.endsWith("a")){//
//                words.remove(s);
//            }
//        }

        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).endsWith("a")){
                words.remove(i);
            }
        }

        System.out.println(words);
    }
}
