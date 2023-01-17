package HomeWork5;



public class HWTask6 {
    public static void main(String[] args) {
        /*
        6) Create an array of countries. While retrieving all values
        from an array print capital for each country choose any five countries.
         */


        String[] country = {"S.Korea", "Japan", "Morocco", "Spain", "Mexico"};
        String[] capital = {"Seoul", "Tokyo", "Rabat", "Madrid", "New Mexico"};

        for (int i = 0; i < country.length; i++) {

            System.out.println(capital[i] + " is the capital of " + country[i]);


        }
    }
}


