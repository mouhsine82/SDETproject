package class24;

public class PhoneTester {
    public static void main(String[] args) {
        Phone [] phones={new IPhone(),new Samsung()};
        for (Phone po:phones){
            po.unlockPhone();
            po.SendText();
            po.displayPictures();

        /*   OR
        for (int i = 0; i < phones.length; i++) {
            Phone p=phones[i];
            p.displayPictures();
            p.unlockPhone();
            p.sendText();
        */


        }
    }
}
