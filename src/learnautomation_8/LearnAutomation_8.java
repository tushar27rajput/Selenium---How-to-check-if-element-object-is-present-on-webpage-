/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnautomation_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author tusshar
 */
public class LearnAutomation_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          System.setProperty("webdriver.gecko.driver","C:\\Users\\tusshar\\Downloads\\geckodriver.exe");
          
          WebDriver driver = new FirefoxDriver();
          
          driver.get("http://demowebshop.tricentis.com/");
          driver.manage().window().maximize();
          if (driver.findElements(By.xpath("//a[@class='ico-login1']")).size() != 0 )
            {
                System.out.println("Element is present on WebPage");
            }
          else 
           {
                System.out.println("Element is not present on webpage");
           }
          
    }
    
}
