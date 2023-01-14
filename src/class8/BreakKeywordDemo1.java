package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {
// this will print 6 time till the temp reach 100 then break the loopsee the output.
        boolean summer=true;
        int temp=75;
        while (summer){

            if(temp<=100){
                System.out.println("I love summer coz temperature is "+temp);
            }else{
                System.out.println("its very hot "+temp);
                break;
            }
            temp+=5;
        }
        System.out.println("*********************");
// same way for loop
        for (temp = 75; temp <=100 ;temp+=5) {
            System.out.println("I love summer coz temperature is "+temp);

        }
        System.out.println("its very hot "+temp);

    }
}
