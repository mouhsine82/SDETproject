package HomeWork1;

public class DiplomaIfStatement {
    public static void main(String[] args) {

        boolean diploma = true;
        float score = 3.5f;
        if (diploma) {
            System.out.println("Congratulation");

        } else {
            System.out.println("Get a degree");
        }
        if (score >= 3.5){

            System.out.println("You are eligible for scholarship");
        }else{
            System.out.println("You should have studied harder");


        }


    }
}
