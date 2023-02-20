package class23;

public class ClassStudent {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */

    public void breakTime(){
        System.out.println("Take a short break");
    }
    public void extraCredit(){
        System.out.println("Get extra credit");
    }
    public void graduate(){
        System.out.println("congrats!!");
    }
}
class SyntaxStudent extends ClassStudent{
    @Override
    public void breakTime() {
        System.out.println("watch video in your break");
    }

    @Override
    public void extraCredit() {
        System.out.println("complete homework for extra credit ");
    }

    @Override
    public void graduate() {
        System.out.println("Get certificate");
    }
}
class CollegeStudent extends ClassStudent{
    @Override
    public void breakTime() {
        System.out.println("14 min break");
    }

    @Override
    public void extraCredit() {
        System.out.println("finish task for credit");
    }

    @Override
    public void graduate() {
        System.out.println("Diploma after grad");
    }
}
class SchoolStudent extends ClassStudent{
    @Override
    public void breakTime() {
        System.out.println("No breaks");
    }

    @Override
    public void extraCredit() {
        System.out.println("a lots of HW for credit");
    }

    @Override
    public void graduate() {
        System.out.println("graduate to high school");
    }
}

