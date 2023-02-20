package class27ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        String name = "Mouhsine";
        String name2 = "Younes";
        String name3 = "Anes";

        String[] names = {"jon", "HY", "Smith", "Brad"};
        displayNames(names);
        display2(name,name2,name3);
    }
    public static void displayNames(String[] names){
        // write code to print all the names from array in console.
        for(String name:names){
            System.out.println(name);
        }

    }

    public static void display2(String name, String name2,String name3){
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
    }
}
