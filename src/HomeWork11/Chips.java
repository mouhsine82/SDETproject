package HomeWork11;

public class Chips {
    /*
    Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.

     */
    String name;
    String flavor;


    void cheesy() {
        System.out.println(" cheesy method from snacks class ");
    }
}
    class Doritos extends Chips {
        double weight;

        void crunchy() {
            System.out.println("Crunchy method from Doritos class");
        }
    }
        class Pringles extends Doritos{

            double price;

            void texture(){
                System.out.println("texture method from Pringles class");
            }


        }

