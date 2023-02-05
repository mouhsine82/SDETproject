package HomeWork11;

public class ChipsTester {
    public static void main(String[] args) {
        System.out.println("-----  creating an object from Chips class");
        Chips chips1=new Chips();
        chips1.name="Lays";
        chips1.flavor="Original";
        chips1.cheesy();


        System.out.println("----   creating an object from Doritos class");

        Doritos chips2=new Doritos();
        chips2.name="Doritos";
        chips2.flavor="BBQ";
        chips2.weight=4.1;
        chips2.crunchy();
        chips2.cheesy();


        System.out.println("----- creattin an object from Pringles class");

        Pringles chips3=new Pringles();
        chips3.name="Pringles";
        chips3.flavor="Sour cream";
        chips3.price=2.49;
        chips3.weight=12;
        chips3.texture();
        chips3.crunchy();
        chips3.cheesy();

    }
}
