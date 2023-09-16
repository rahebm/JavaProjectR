package Class22;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] arr = {new ChromeDriver(), new Firefox()};
        for (WebDriver d : arr) {
            d.openBrowser();
            d.loadURL("Amazon.com");
            d.performTesting();
            d.close();

        }
    }

}
