package practices.Practice3.sample3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import practices.Drivers.drivers.Drivers;

public class InterfacePractice {
    WebDriver driver;

    ChromeOptions options = new ChromeOptions();


    @BeforeTest

    public void settings() {

        options.addArguments("--remote-allow-origins=*");

        System.setProperty(Drivers.ChromeWebDriver, Drivers.ChromePath);

        driver = new ChromeDriver(options);

    }

    @Test(priority=1)

    public void b() {

        Chrome f = new Chrome();
        Chrome nav = new Chrome();
        Chrome c= new Chrome();
        driver.get(nav.navigate(driver,"https://www.facebook.com"));
        f.fullScreen(driver);



    }
    @Test(priority=2)
    public void t() throws InterruptedException {
    Chrome c= new Chrome();
    Thread.sleep(5000);
    c.close(driver);

    }

}

