package JavaProject2_18;

public interface WebDriver {

    void open();
    void close();
    void getTitle();
}
  interface RemoteWebDriver {

     void navigate();

}
interface TakesScreenShot extends WebDriver,RemoteWebDriver{
     void getScreenShot();
}
class ChromeDriver implements TakesScreenShot, WebDriver,RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome browser");
    }

    @Override
    public void getTitle() {
        System.out.println("Get Chrome title");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Chrome browser");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Chrome browser screenshot");
    }
}
class FirefoxDriver implements TakesScreenShot, WebDriver, RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox browser");
    }

    @Override
    public void getTitle() {
        System.out.println("Get Firefox title");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Firefox browser");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Firefox browser screenshot");
    }
}
class SafariDriver implements TakesScreenShot,WebDriver, RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open Safari browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari browser");
    }

    @Override
    public void getTitle() {
        System.out.println("Get Safari Title");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Safari browser");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Get Safari browser screenshot");
    }
}








