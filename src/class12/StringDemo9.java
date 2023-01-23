package class12;

public class StringDemo9 {
    public static void main(String[] args) {

        String str="ahdghffjjyrdscftr 234125 @#$%^";

        int counter=0;
        for (int i = 0; i <str.length() ; i++) {

            if(Character.isAlphabetic(str.charAt(i))){ // to count how many letters
                counter++;                               //(Character.isDigit(str.charAt(i))) is to check how many numbers.
            }

        }
        System.out.println("Total alphabet in str"+counter);
    }
}
