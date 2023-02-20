package class23;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openURL(){
        System.out.println("Opening a url");
    }
    public void testLoginPage(){
        System.out.println("Checking if login page works");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openURL() {
        System.out.println("Opening Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Google Chrome");
    }
}

class Safari extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Starting Safari browser");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the url in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing login page in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Safari browser");
    }
}
class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting FireFox browser");
    }

    @Override
    public void openURL() {
        System.out.println("Opening url in FireFox browser");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login in FireFox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing FireFox browser");
    }
}
