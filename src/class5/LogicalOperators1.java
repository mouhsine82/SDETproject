package class5;

public class LogicalOperators1 {
    public static void main(String[] args) {
       /* if both true will be true if both false will be false
       if(false n true) will be true, at least need 1 true
       to be true.
        */
        boolean boughtCho=true;
        boolean boughtFlowers=true;
        if(boughtCho||boughtFlowers){
            System.out.println("I am happy");

        }else{
            System.out.println("I am sad");
        }

        boolean wifi=false;
        boolean fiveG=false;
        if(wifi||fiveG){
            System.out.println("browse internet");
        }else{
            System.out.println("connect to wifi or 5G");

        }





    }
}
