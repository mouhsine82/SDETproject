package class19;

public class Furniture {
    String type;
    String color;
    double price;


    // with the help of constructor we can initialize object with specific value.
   Furniture(String type, double price, String color){
       this.type=type;   // (this.type)on the left refer to instance variable / (type) on the right refer to local variable
       this.price=price;
       this.color=color;
   }


   //void Furniture(){

   //}   this a method with name furniture. why coz of return type void Furniture (){}

    void print(){
        System.out.println(type+" price is "+price+" and color is "+color);
    }
}
