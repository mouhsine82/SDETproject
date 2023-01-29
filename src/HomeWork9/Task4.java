package HomeWork9;

public class Task4 {
    //4)Create a method that will say Hello in different language based
    // on the country that will be passed when method is executed

    String sayHello(String country) {
        switch (country) {
            case "Morocco":
                return "أهلا";
            case "France":
                return "Salut";
            case "Spain":
                return "Hola";
            case "India":
                return "नमस्ते";
            default:
                return "Sorry I don't know";


        }
    }


    // Task4 tester
    public static void main(String[] args) {

        Task4 greetings=new Task4();
        System.out.println(greetings.sayHello("Morocco"));
    }



}
