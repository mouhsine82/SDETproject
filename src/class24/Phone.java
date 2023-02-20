package class24;

public abstract class Phone {
      /*
    create a phone class lets create abstract methods like displayPictures
    unlockPhone
    SendText
    2 child classes  IPhone Samsung Google  and provide specific implementation
    lets write code to achieve runtime polymorphism
     */
    abstract void displayPictures();
    abstract void unlockPhone();
    abstract void SendText();

}
class IPhone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Iphotos browser the photo");
    }

    @Override
    void unlockPhone() {
        System.out.println("FaceId to unlock the Phone");
    }

    @Override
    void SendText() {
        System.out.println("Lets use the IMessage to send the text");
    }
}
class Samsung extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Gallery app to browse the photos");
    }

    @Override
    void unlockPhone() {
        System.out.println("Using fingerPrint sensor or camera");
    }

    @Override
    void SendText() {
        System.out.println("Messages app to send the message");
    }
}
