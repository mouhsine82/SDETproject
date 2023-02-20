package class23;

public class ComputerTester {
    public static void main(String[] args) {

        // int a=(int)12.5;

        Computer[] computers = {new Apple(), new HP()};

        for (Computer c : computers) {
            c.playVideo();
            c.browserInternet();

            if (c instanceof Apple) { // we are checking if the variable c contains the object of an Apple class
                Apple apple = (Apple) c; // converting the variable c back to an apple object
                apple.installApp();
                apple.editVideos();
            }
        }

    }
}