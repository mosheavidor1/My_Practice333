package practices.Practice3.sample3;

import org.openqa.selenium.WebDriver;

public class Chrome implements Browser{

    WebDriver driver;


    @Override
    public void open() {
        System.out.println("Chrome browser is open");

    }

    @Override
    public String navigate(WebDriver driver,String url) {

        System.out.println("Go to "+url);
        return url;
    }

    @Override
    public void fullScreen(WebDriver driver) {
        driver.manage().window().fullscreen();
    }


    @Override
    public void close(WebDriver driver) {

        System.out.println("Closing Chrome");
        driver.quit();

    }
}