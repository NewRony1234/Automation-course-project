import StepObject.LogOutStep;
import Utils.SetupLogin;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout extends SetupLogin {


        @Test (groups = "Test2")
        @Severity(SeverityLevel.TRIVIAL)
        @Description ("კაბინეტიდან გასვლა")

        public void logOutFrom() throws InterruptedException {
            LogOutStep obj1 = new LogOutStep(driver);
            obj1.out();
            Thread.sleep(3000);

        }

}

