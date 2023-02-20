package class24;

public class FinalDemo {
    public static void main(String[] args) {

        final int num; // we have created a constant variable
        num = 20;  // as soon as we assigned a value to variable we can't change the value coz its declare as Final
        // num=30; not possible because the variable is declared final
    }

        final void noOneShouldOverrideIt () {
            System.out.println("This method should never be overridden otherwise it might break the code base");
        }
    }
    /*
class Person extends FinalDemo{
    void noOneShouldOverrideIt(){  // can't override this method as it is declared as final
        System.out.println("Let me do that");
    }
}
*/


