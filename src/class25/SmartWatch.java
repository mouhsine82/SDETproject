package class25;
interface WashAble{
    void wash();
}
public class SmartWatch implements WashAble{


    @Override
    public void wash() {
        System.out.println("I am IP65 rated you can wash me");
    }
}
class Phone implements WashAble{
    public void wash(){
        System.out.println("I am IP65 rated you can wash me");
    }

}
class Inverter implements WashAble{
    public void wash(){
        System.out.println("I am IP65 rated you can wash me");
    }
}
