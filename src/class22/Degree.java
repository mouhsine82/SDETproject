package class22;

public class Degree {


    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree {

    }

    class Master extends Degree {
    @Override
    void getPrerequisite() {
            System.out.println("To get a degree you need Bachelor Degree first");// override method from parent class
        }
    }
class DegreeTester{
    public static void main(String[] args) {
      Degree degree=new Degree();
      degree.getPrerequisite();

      Bachelors bachelors=new Bachelors();
      bachelors.getPrerequisite();

      Master master=new Master();
      master.getPrerequisite();
    }
}
