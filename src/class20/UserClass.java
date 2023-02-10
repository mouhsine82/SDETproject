package class20;

public class UserClass {
    /*
    Write program: userClass  that has a constructor that initializes instance
    variable name and mobile number. Create a subclass  userInfo that will have
    user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.

     */

    String name;
    int mobileNumber;

    UserClass(String name, int mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;

    }
}
class UserInfo extends UserClass {

    String address;

    UserInfo(String name, int mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;

    }

    void userDetails() {
        System.out.println("User name is " + name + " user phone number " + mobileNumber + " user address " + address);
    }


}



