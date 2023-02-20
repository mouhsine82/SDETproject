package JavaProject2_18;

abstract public  class Marks {
    /*
    2. We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code

     */
    abstract double getPercentage();
}
class A extends Marks {
    double math, history, science;
    A (double math, double history, double science) {
        this.math = math;
        this.history = history;
        this.science = science;
    }
    @Override
    double getPercentage() {
        return (math+history+science)/3;
    }
}
class B extends Marks{
    double math,history,science,pe;
     B (double math, double history, double science, double pe) {
         this.math = math;
         this.history = history;
         this.science = science;
         this.pe=pe;
     }
     @Override
     double getPercentage() {
         return (math+history+science+pe)/4;
     }
 }
class MarksTester {
    public static void main(String[] args) {
           A student1=new A(90,78,98);
          System.out.println("Average score for student A is: "+student1.getPercentage());

           B student2=new B(98,78,98,100);
           System.out.println("Average score for student B is: "+student2.getPercentage());

        }
    }


