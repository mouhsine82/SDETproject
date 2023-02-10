package class20;

public class BaseClass {

    String name="John";

    void hello(){
        System.out.println("Hello method from BaseClass");
    }
}

class Child extends BaseClass{

    String name="Jane";

    void callMe(){
        System.out.println(this.name);//to refer to the variable in the same class "Jane"
        System.out.println(super.name); // to refer to the Base class if there is 2 similar variables in Base class and sub class "John".
    }

    void hello(){
        System.out.println("Hello Method from subclass");
    }

    void callingParentMethod(){
        super.hello(); //refer to the methods in Base class
        this.hello();// refer to the method in Subclass
    }

}
