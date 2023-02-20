package class27ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        //create a method which can search a name from this array return true if name is present in the array
        String name = "smith";
        String[] names = {"jon", "HY", "Smith", "Brad"};
        System.out.println(contains(name,names));


    }
        public static boolean contains (String nameToBeSearch, String[] names) {
            for (String name:names){
                if(nameToBeSearch.equals(name)){
                    return true;
                }
            }
            return false;
        }
    }

