package class19;

public class ConstructorChain {
    // Chained constructor
    ConstructorChain(){
        System.out.println("I am non argument constructor");
    }

    ConstructorChain(String str){ // this parametrized
        this();// making a call to non argument constructor
               //this(); always must be on the first line
        System.out.println(str);
    }

    ConstructorChain(String str,int number){
        this(str);
        System.out.println("This is constructor with int parameter"+number);
    }

    public static void main(String[] args) {
        ConstructorChain obj=new ConstructorChain("hello",10);


    }

}
