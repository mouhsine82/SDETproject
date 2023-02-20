package class27ArrayList;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        // we have created an
        ArrayList<String> names=new ArrayList<>();
        names.add("Younes");
        names.add("Anes");
        names.add("Hy");
        names.add("Mouhsine");

        System.out.println(names);
        names.clear();// will delete all from ArrayList
        System.out.println(names);




    }
}
