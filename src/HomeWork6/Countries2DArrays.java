package HomeWork6;

public class Countries2DArrays {
    public static void main(String[] args) {

        /*
        Create 2D array of countries: north america countries, south america countries,
        europe countries, asian countries, african countries. Then print all values
        from that array using 2 different loops and calculate how many total countries been stored
         */

        String[][] countries = {{"Canada", "USA", "Mexico"},
                              {"Brazil", "Argentina", "Peru"},
                              {"France", "Germany", "Belgium"},
                                 {"Japan", "S.Korea", "China"},
                                {"Morocco", "Egypt", "Senegal"}};

        System.out.println("******* First Loop ************");
       int count=0;
        for (int i = 0; i < countries.length; i++) {  // countries.length tell us how many single D arrays
            for (int j = 0; j < countries[i].length; j++) { // countries.length[i] tell us how many index in single D arrays
                count++;
                System.out.print(countries[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("***** Second Loop ******");
       // using enhanced for loop
        for (String[] country : countries) {
            for(String s:country){
                System.out.print(s+" ");
                count++;
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("******* Total Sum ********");
        System.out.println("Total Countries is: "+count);


    }
}