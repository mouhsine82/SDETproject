package HomeWork6;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone= new Phone();
      // Iphone
        iphone.name="IPhone 14 Pro";
        iphone.color="Gold";
        iphone.capacity="128 GB";
        iphone.weight="206 grams";
        iphone.price=1200;
        iphone.videoRecording();
        iphone.faceId();
        iphone.speak();
        System.out.println("*************************");
        // Pixel phone
        Phone pixel= new Phone();
        pixel.name="Pixel 7";
        pixel.color="Silver";
        pixel.capacity="128 GB";
        pixel.weight="197 grams";
        pixel.price=599;
        pixel.speak();
        pixel.videoRecording();
        pixel.Authentication();
        System.out.println("**************************");
        // Samsung phone
        Phone samsung= new Phone();
        samsung.name="Samsung Flip Z 4";
        samsung.color="Purple";
        samsung.capacity="128 GB";
        samsung.weight="187 grams";
        samsung.price=1099;
        samsung.faceId();
        samsung.speak();
        samsung.videoRecording();



    }
}
