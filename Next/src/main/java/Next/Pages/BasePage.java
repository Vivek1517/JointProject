package Next.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage {
    //Global data and global methods
    public static String url = "https://www.next.co.uk/";
    public static String browserName = "chrome";
    public static WebDriver driver;

    public void openBrowser(String browserName, String url) {

        switch (browserName) {
            case "chrome":
                if(browserName.equalsIgnoreCase("chrome"))
                    //Chrome Browser
                    WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                if(browserName.equalsIgnoreCase("firefox"))
                    //firefox Browser
                    WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "ie":
                //IE Browser
                if(browserName.equalsIgnoreCase("ie"))
                    WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "edgedriver":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Browser is not supported");
        }

        //open URL
        driver.get(url);

        //Maximise the browser
        driver.manage().window().maximize();
    }

    public void closeBrowser()  {
        driver.quit();
    }
}


