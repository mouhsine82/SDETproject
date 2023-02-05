package class19;

public class ThisKeyword {

    int a,b;

    ThisKeyword(int a, int b){
        this.a=a; //(this) refers to instance variable
        this.b=b;
    }

    public void sum(int a, int b){
        System.out.println("Sum of local variables = "+(a+b));
        System.out.println("sum of instance variables= "+(this.a+this.b));
    }
    void hello(){
        System.out.println("hello batch 15");
    }
    void howAreYou(){
        System.out.println("How are you batch 15?");
    }
    void greetings(){
        this.hello();// this keyword refers to current instance methods
        this.howAreYou();
    }

    public static void main(String[] args) {

        ThisKeyword obj=new ThisKeyword(10,20);
        System.out.println(obj.a);

        obj.sum(100,200);

        //--------------------------------------
        obj.greetings();
    }
}
