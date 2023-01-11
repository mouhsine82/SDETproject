package class3;

public class IfElse_9 {
    public static void main(String[] args) {
        char c='M';

        if(c=='M'){
            System.out.println("Male");
        }

        // with non-primitive data such as String we can't use symbol or relational operators
        String name="Nat";
        if(name.equals("Sam"))
        {
            System.out.println("amazing student");
        }
        if(!name.equals("Sam")){ // add ! for not
            System.out.println("Super Amazing");
        }

        boolean hungry=true;
        if(hungry){ // it will print "lets eat" cz the variable hungry is true
            System.out.println("lets eat");

            if(!hungry){ // it will not print "lets eat" cz the variable hungry is true we already add ! which mean not
                System.out.println("lets eat");

            }
        }
    }
}
