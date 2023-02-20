package class23;

public class FinalKeyword {
    //
   // final keyword mean NO one can change the value of the variable.
    final double gravity=9.8;
    final double PI=3.14;
    final double LightSpeed=299792458;

  final void tryChangingGravity(){
       // gravity=1.6; //we get an error because this variable is marked FINAL.
   }

}
//class Child extends FinalKeyword{
//    @Override
//   // void tryChangingGravity() { // error because the final method can not change.
//


