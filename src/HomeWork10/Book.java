package HomeWork10;

public class Book {
    /*
    6) Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */

    String name;
    String genre;
    String released;

    Book(String name, String genre){
        this.name=name;
        this.genre=genre;
    }

     Book(String name, String genre, String released){
       this(name, genre);
        this.released =released;
    }
    void display(){
        System.out.println("Book name "+name+" book genre is "+genre+" released on "+ released);
    }
}
