package Class22;

public abstract class WebDriver {
    abstract void openBrowser();
    abstract void loadURL(String url);
    abstract void performTesting();
    abstract void close();

}
class ChromeDriver extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Opening the Google Chrome browser");
    }

    @Override
    void loadURL(String url) {
        System.out.println("loading the URL "+url);
    }


    @Override
    void performTesting() {
        System.out.println("perform testing");
    }

    @Override
    void close() {
        System.out.println("closing the Chrome browser");
    }
}
class Firefox extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Opening the Google Firefox browser");
    }

    @Override
    void loadURL(String url) {
        System.out.println("loading the URL "+url);
    }

    @Override
    void performTesting() {
        System.out.println("perform testing");
    }

    @Override
    void close() {
        System.out.println("closing the Firefox browser");
    }
}