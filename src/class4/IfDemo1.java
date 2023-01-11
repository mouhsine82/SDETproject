package class4;

public class IfDemo1 {
    public static void main(String[] args) {
        int money=15000;
        if(money>1000) {
            System.out.println("lets bye an Iphone");
        }
        if(money>2000){
            System.out.println("lets also buy a Macbook");
        }
        boolean mothersDay=true;
        if(mothersDay){
            System.out.println("happy mothers day");
        }
        String name="Younes";
        if (name=="Younes"){ // equals method is only used for non-primitives.==> if(name.equals("Younes"))
        System.out.println("I love soccer");
        }
    }
}
