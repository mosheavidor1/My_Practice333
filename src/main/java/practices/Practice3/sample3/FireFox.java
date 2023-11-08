package practices.Practice3.sample3;

import org.openqa.selenium.WebDriver;

public class FireFox implements Browser{
    @Override
    public void open() {
        System.out.println("FireFox browser is open");


    }

    @Override
    public String navigate(WebDriver driver,String url) {
        System.out.println("Go to "+url);
        return url;
    }

    @Override
    public void fullScreen(WebDriver driver) {

    }


    @Override
    public void close(WebDriver driver) {

        System.out.println("Closing Firefox");
        driver.quit();

    }
}