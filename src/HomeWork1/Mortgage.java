package HomeWork1;

public class Mortgage {
    public static void main(String[] args) {

        float mortgageRate=4.5f;
        int mortgagePrice=200000;
        if(mortgageRate>4.5){
            System.out.println("Will not buy a house");

        }else{
            System.out.println("Lets buy a House");

        }
        if(mortgagePrice>200000){
            System.out.println("Will apply for a loan");
        }else{
            System.out.println("Will pay Cash");
        }


    }
}
