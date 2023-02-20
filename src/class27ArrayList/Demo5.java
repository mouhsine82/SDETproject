package class27ArrayList;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('M');
        characters.add('y');
        characters.add('l');
        characters.add('e');
        characters.add('n');

        for(Character c:characters){
            System.out.println(c);
        }
    }
}
