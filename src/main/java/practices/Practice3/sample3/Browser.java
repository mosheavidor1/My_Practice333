package practices.Practice3.sample3;

import org.openqa.selenium.WebDriver;

public interface Browser{


    void open();
    String navigate(WebDriver driver,String url);

    void fullScreen(WebDriver driver);

    void close(WebDriver driver);
}