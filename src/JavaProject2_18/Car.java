package JavaProject2_18;

public class Car {
    /*
    3. Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount
     */
    int carPrice;
    String color;
    Car (int carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    double calculateSalePrice() {
        return carPrice;
    }

}
class Truck extends Car{
    double weight;
    Truck(int carPrice, String color,double weight){
        super(carPrice, color);
        this.weight=weight;
}
    @Override
    double calculateSalePrice() {
        if(weight>2000){
            return carPrice-(0.1*carPrice);
        }else{
            return carPrice-(0.2*carPrice);
            }
    }
}
class Sedan extends Car {
    double length;

    Sedan(int carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            return carPrice-(0.05*carPrice);
        } else {
            return carPrice-(0.1*carPrice);
        }
    }


        public static void main(String[] args) {

            Truck truck = new Truck(75000,"White",2400);
            System.out.println("Truck price after discount is: " + truck.calculateSalePrice());
            Sedan sedan=new Sedan(32000,"Red",20);
            System.out.println("Sedan price after discount is: " + sedan.calculateSalePrice());
        }
    }



