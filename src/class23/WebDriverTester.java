package class23;

public class WebDriverTester {
    public static void main(String[] args) {
     // Polymorphism
        WebDriver webDriver=new Safari();// if you want to test in different browser all you need is to change the browser name.
        // FireFox fireFox=new WebDriver();  // not allow because down castin
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();

        System.out.println("**********************************************************");

         // an Array of type parent class (WebDriver) can hold the objects of all the child classes. but Not vice Versa.
     WebDriver [] browsers={new Chrome(),new Safari(),new FireFox()}; // creating array and using enhanced ForLoop to test multiple browser at once.

          for(WebDriver browser:browsers){
              browser.startBrowser();
              browser.openURL();
              browser.testLoginPage();
              browser.closeBrowser();
          }
    }
}
