package class12;

public class StringDemo8 {
    public static void main(String[] args) {

        String str="Java is love";
        char c=str.charAt(2);
        System.out.println(c); // this can get 1 caracter (2 is v) from the string

        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i));// using loop can print all the character from the string

        }
     int counter=0; // to print how many character in the string
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a'){
                counter++;
            }

        }
        System.out.println(counter);


    }
}
