package class16;

public class PersonTester {
    public static void main(String[] args) {

        Person person=new Person();
        //System.out.println(person.bankBalance); // can't access in other class coz its declare as private
        System.out.println(person.Address);
        System.out.println(person.name);

       person.printSSN();
       person.printTikTokAccount();
       // person.printPhonePassword(); can access cz its private


    }
}
