package class16;

public class Person {


    private double bankBalance=2345671; //private keyword can access only in same class not other different class or package or project
    String Address="street 3456"; //default is not keyword: access level is applied. within same package
    public String name="Jon Snow";// public keyword can access any class in your project.

    private void printPhonePassword(){
        System.out.println("pass12345");
    }
    void printSSN(){   // either go witg default or private
        System.out.println("234-567-231");
    }
    public void printTikTokAccount(){ // go with public
        System.out.println("user 123");
    }
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printSSN();
        person.printTikTokAccount();

    }
}
