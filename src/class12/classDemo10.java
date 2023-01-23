package class12;

public class classDemo10 {
    public static void main(String[] args) {


       String str="Java is not pain";
        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("not")); // this will display which index is the character

        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i)+" has the index "+i);// will print all the character with index numbers

        }
    }
}
