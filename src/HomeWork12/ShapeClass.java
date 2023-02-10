package HomeWork12;

public class ShapeClass {
    /*
    1. Write program: Shape class has a constructor that takes the radius and has a
    subclass as  circle class. In circle class create a method to calculate the area of circle. Test your code
*/

double radius;

   void shape(double radius){
       this.radius=radius;
}
static class Circle extends ShapeClass{

       double pi;

        Circle(double radius, double pi){
           super.radius=radius;
           this.pi=pi;
       }
       void calculate(){
           System.out.println("The area of the circle is: "+radius*pi*pi);
       }
}

    public static void main(String[] args) {

       Circle area=new Circle(5,2);
       area.calculate();
    }


}


