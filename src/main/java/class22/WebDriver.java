package class22;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window");

    }

    @Override
    public void findElement() {
        System.out.println("Finding Web Element using web driver commands");
    }
}

class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing Window");
    }

    @Override
    public void findElement() {
        System.out.println("Finding web element on the web page");
    }
}
class WebTester{
    public static void main(String[] args) {


    WebDriver[] arr={new ChromeDriver(), new FirefoxDriver()};
    for(WebDriver t:arr){
        t.openBrowser();
        t.closeBrowser();
        t.maximizeWindow();
    }
}}
