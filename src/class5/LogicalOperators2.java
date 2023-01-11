package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {
        /*
        they only work with boolean data types
        || if 1 condi true the rest is true
        && if 1 condi is false the rest is false

         */

        double mathScore=89.5;
        double historyScore=91.5;
        double ScienceScore=93.5;
        if(mathScore>90 && historyScore>90 && ScienceScore>90){
            System.out.println("You are brillant student");


        }else{
            System.out.println("You need to work hard");
        }
        // the variable is false and if condi NOT false coz (!). false vs true will execute the if condi. see exp: below.
        //(!) simply reverses the condition
        boolean isTrue=false;
        if(!isTrue){
            System.out.println("you got it");
        }else {
            System.out.println("need more practice");



            /*boolean cond=false;
            boolean condition=!cond;
            System.out.println(condition);

            if(condition){
                System.out.println(" You got it");
            }else {
                System.out.println("Need more practice");
            }
        }

             */
        }





    }
}
