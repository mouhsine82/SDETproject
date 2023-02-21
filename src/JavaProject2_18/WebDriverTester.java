package JavaProject2_18;

public class WebDriverTester {

    public static void main(String[] args) {
        WebDriver[] webDriver = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (WebDriver w : webDriver) {
            w.open();
            w.close();
            w.getTitle();

            // navigate and TakeScreenShot not available

            TakesScreenShot[] screenShots = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
            for (TakesScreenShot take : screenShots) {
                take.open();
                take.close();
                take.getTitle();
                take.getScreenShot();
                take.navigate();

            }
            SafariDriver safari = new SafariDriver();
            safari.getScreenShot();
            safari.navigate();
        }
    }
}
