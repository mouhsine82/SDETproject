package HomeWork10;

public class Task1 {
    /*
    1) Write a java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */

  String carMake;
  String carModel;
  int carYear;


  Task1 (String makeName, String modelName, int yearName){
      carMake=makeName;
      carModel=modelName;
      carYear=yearName;

  }
  Task1(){
      carMake="Tesla";
      carModel="Model S 3";
      carYear=2022;
  }
  void carInfo(){
      System.out.println("Car make "+carMake+" car model "+carModel+" year: "+carYear);
  }


}
