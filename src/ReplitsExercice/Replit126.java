package ReplitsExercice;

public class Replit126 {
    /*
    Create a variable that will hold the count of all instances of the Main class

    Create 3 Object of the class and print value of the count variable;

     */

    public static int count=0;
    public Replit126(){
        count++;
    }
    public static int getCount(){
        return count;
    }
    public static void main(String[]args){
        Replit126 ob1=new Replit126();
        Replit126 ob2=new Replit126();
        Replit126 ob3=new Replit126();
        System.out.println(Replit126.getCount());
    }


}
