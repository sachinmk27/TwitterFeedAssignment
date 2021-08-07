package com.zs.twitter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class TwitterData {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","/home/satyendra/IdeaProjects/Twitter/chrome/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.get("https://twitter.com/explore");
        driver.get("https://twitter.com/sachintendulkar");
        sleep(5);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //js.executeScript("window.scrollTo(0, 275)");
        List<WebElement> elements = new ArrayList<>();
        //elements = driver.findElements(By.tagName("article"));

        //System.out.println("Size of elements: "+elements.size());
        //elements = driver.findElements(By.tagName("article"));
        while (true){
            if(elements.size()>5){
                System.out.println("Inside loop : "+elements.size());
                break;
                //System.out.println("Inside loop : "+elements.size());
            }else {

                elements = driver.findElements(By.tagName("article"));
                //sleep(5);
                //js.executeScript("window.scrollTo(0, 275)");
            }
           // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        }

            //List<WebElement> elements = driver.findElements(By.tagName("article"));

          //  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // WebElement element = driver.findElement(By.id("id__8k8p749gobl"));
        //System.out.println(element);
       // List<WebElement> elements = driver.findElements(By.className("css-1dbjc4n r-14lw9ot r-jxzhtn r-1ljd8xs r-13l2t4g r-1phboty r-1jgb5lz r-11wrixw r-61z16t r-1ye8kvj r-13qz1uu r-184en5c"));

//        WebElement webElement= driver.findElement(By.xpath("//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0']"));
//        System.out.println(webElement.getText());
          List<String> list = new ArrayList<>();
        for(WebElement webElement: elements){
            list.add(webElement.getText());
        }
        //System.out.println(elements);
        System.out.println("List of size:  "+list.size());
        System.out.println(list);
    }
}
