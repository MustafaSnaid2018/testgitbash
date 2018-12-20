
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.fail;

public class Fasttest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testFasttest() throws Exception {
        driver.get("https://www.google.com/");
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
        driver.get("http://localhost/MiTAP.AdminWebSite/TestCaseDesigner?testCaseID=950448&ProjectID=1073&ProjectName=Green%20Project");
        driver.get("https://www.google.com/");
        driver.get("https://www.google.com/");
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=root | ]]
        driver.get("https://www.google.com/");
        driver.get("https://www.google.com/search?source=hp&ei=2xQZXMD7O4WtsAH-rYjgCg&q=test&btnK=Google+Search&oq=test&gs_l=psy-ab.3..0l10.66919.67514..68383...0.0..0.304.1452.6j3j2j1......0....1..gws-wiz.....0..0i131.uUUuJsSr1Vo");
        driver.get("https://www.google.com/search?source=hp&ei=2xQZXMD7O4WtsAH-rYjgCg&q=test&btnK=Google+Search&oq=test&gs_l=psy-ab.3..0l10.66919.67514..68383...0.0..0.304.1452.6j3j2j1......0....1..gws-wiz.....0..0i131.uUUuJsSr1Vo");
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
        driver.get("https://www.google.com/search?source=hp&ei=2xQZXMD7O4WtsAH-rYjgCg&q=test&btnK=Google+Search&oq=test&gs_l=psy-ab.3..0l10.66919.67514..68383...0.0..0.304.1452.6j3j2j1......0....1..gws-wiz.....0..0i131.uUUuJsSr1Vo");
        driver.get("https://www.google.com/search?source=hp&ei=2xQZXMD7O4WtsAH-rYjgCg&q=test&btnK=Google+Search&oq=test&gs_l=psy-ab.3..0l10.66919.67514..68383...0.0..0.304.1452.6j3j2j1......0....1..gws-wiz.....0..0i131.uUUuJsSr1Vo");
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=root | ]]
        driver.get("https://www.google.com/search?source=hp&ei=2xQZXMD7O4WtsAH-rYjgCg&q=test&btnK=Google+Search&oq=test&gs_l=psy-ab.3..0l10.66919.67514..68383...0.0..0.304.1452.6j3j2j1......0....1..gws-wiz.....0..0i131.uUUuJsSr1Vo");
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
        driver.get("https://www.google.com/search?source=hp&ei=2xQZXMD7O4WtsAH-rYjgCg&q=test&btnK=Google+Search&oq=test&gs_l=psy-ab.3..0l10.66919.67514..68383...0.0..0.304.1452.6j3j2j1......0....1..gws-wiz.....0..0i131.uUUuJsSr1Vo");
        driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj29_PV26nfAhXEuHEKHfogAIkQPAgH");
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=root | ]]
        driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj29_PV26nfAhXEuHEKHfogAIkQPAgH");
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
        driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj29_PV26nfAhXEuHEKHfogAIkQPAgH");
        driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj29_PV26nfAhXEuHEKHfogAIkQPAgH");
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=root | ]]
        driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj29_PV26nfAhXEuHEKHfogAIkQPAgH");
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
        driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj29_PV26nfAhXEuHEKHfogAIkQPAgH");
        driver.get("http://localhost/MiTAP.AdminWebSite/TestCaseDesigner?testCaseID=950448&ProjectID=1073&ProjectName=Green%20Project");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
