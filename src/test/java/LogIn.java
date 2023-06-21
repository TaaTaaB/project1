import StepObject.LogInSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.LogInData.*;



public class LogIn {
        @Test
        public void logInWithIncorrectData() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://accounts.gpih.ge/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fresponse_type%3Dcode%26client_id%3Dmygpi%26state%3DVkZTZkxEY1VqM05PaEpUQ2dWa2pjU3huWUNmY25Uck0wNmdFWW13dDdpd2Nr;%25252Fka-GE%25252Fpersonal-area%25252Fdashboard%26redirect_uri%3Dhttps%253A%252F%252Fmygpi.ge%252Fka-GE%252Fidentity%26scope%3Dopenid%2520profile%2520offline_access%26code_challenge%3DlpLTIgrEcBC8-iThsbIWENWBvn6o3XvC0bKCQuWlYKs%26code_challenge_method%3DS256%26nonce%3DVkZTZkxEY1VqM05PaEpUQ2dWa2pjU3huWUNmY25Uck0wNmdFWW13dDdpd2Nr%26culture%3Dka-GE");
            String actualTitle = driver.getTitle();
            String expectedTitle = "Account MyGPI";
            Assert.assertEquals(actualTitle, expectedTitle);

            LogInSteps step1 = new LogInSteps(driver);
            step1.emailInput(incorrectEmailData);
            step1.passwordInput(incorrectPasswordData);
            step1.logInButton();
            Thread.sleep(5000);
        }
        @Test
        public void logInWithcorrectData() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://accounts.gpih.ge/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fresponse_type%3Dcode%26client_id%3Dmygpi%26state%3DVkZTZkxEY1VqM05PaEpUQ2dWa2pjU3huWUNmY25Uck0wNmdFWW13dDdpd2Nr;%25252Fka-GE%25252Fpersonal-area%25252Fdashboard%26redirect_uri%3Dhttps%253A%252F%252Fmygpi.ge%252Fka-GE%252Fidentity%26scope%3Dopenid%2520profile%2520offline_access%26code_challenge%3DlpLTIgrEcBC8-iThsbIWENWBvn6o3XvC0bKCQuWlYKs%26code_challenge_method%3DS256%26nonce%3DVkZTZkxEY1VqM05PaEpUQ2dWa2pjU3huWUNmY25Uck0wNmdFWW13dDdpd2Nr%26culture%3Dka-GE");
            String actualTitle = driver.getTitle();
            String expectedTitle ="MyGPI";
            Assert.assertNotEquals(actualTitle, expectedTitle);

            LogInSteps step2 = new LogInSteps(driver);
            step2.emailInput(correctEmailData);
            step2.passwordInput(correctPasswordData);
            step2.logInButton();
            Thread.sleep(5000);
            driver.close();

        }



    }






