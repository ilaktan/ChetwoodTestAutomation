package Chetwood.pages;

import Chetwood.utilities.ConfigurationReader;
import Chetwood.utilities.GenericFunctions;
import org.openqa.selenium.By;

public class Login extends GenericFunctions {
    CommonMethods commonMethods = new CommonMethods();
    public  void userClickTheAcceptButton(){
        waitFor(2);
        driver.findElement(By.xpath("//*[text()='Accept']")).click();




    }



}

