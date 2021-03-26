package akshat_tsf;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_241\\chrome driver\\chromedriver.exe");
//        TEST CASE WITH ELEMENTS:
        WebDriver w = new ChromeDriver();

//        ELEMENT 1
        w.get("https://www.thesparksfoundationsingapore.org/");
        w.manage().window().maximize();

//        w.findElement(By.id("identifierId")).sendKeys("jeet11chatterjee@gmail.com");
//        w.findElement(By.className("CwaK9")).click();


        String actual_title = w.getTitle();
        String estimated_title = "The Sparks Foundation | Home";


        if(actual_title.equalsIgnoreCase(estimated_title)){
            System.out.println("Test 1 successful!");
        }
        else{
            System.out.println("Test 1 unsuccessful!");
        }
//        ELEMENT 2
        w.get("https://www.thesparksfoundationsingapore.org/about/vision-mission-and-values/");
        w.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)w;
        js.executeScript("scrollBy(0, 5000)");

        boolean status = w.findElement(By.className("b-nav")).isDisplayed();

        if(status){
            System.out.println("Test 2 successful!");
        }
        else{
            System.out.println("Test 2 unsuccessful!");
        }
//        ELEMENT 3
        w.get("https://www.thesparksfoundationsingapore.org/policies-and-code/code-of-ethics-and-conduct/");
        w.manage().window().maximize();

        boolean status2 = w.findElement(By.className("media-body")).isDisplayed();

        if(status2){
            System.out.println("Test 3 successful!");
        }
        else{
            System.out.println("Test 3 unsuccessful!");
        }
//        ELEMENT 4
        w.get("https://www.thesparksfoundationsingapore.org/links/software-and-app/");
        w.manage().window().maximize();


        boolean status3 = w.findElement(By.className("w3l-blog-list")).isDisplayed();

        if(status3){
            System.out.println("Test 4 successful!");
        }
        else{
            System.out.println("Test 4 unsuccessful!");
        }
//        ELEMENT 5
        w.get("https://www.thesparksfoundationsingapore.org/links/software-and-app/");
        w.manage().window().maximize();


        boolean status4 = w.findElement(By.className("top-header-agile-right")).isDisplayed();

        if(status4){
            System.out.println("Test 5 successful!");
        }
        else{
            System.out.println("Test 5 unsuccessful!");
        }
//        ELEMENT 6
        w.get("https://www.thesparksfoundationsingapore.org/");
        w.manage().window().maximize();

        boolean status5 = w.findElement(By.className("flex-active")).isDisplayed();

        if(status5){
            System.out.println("Test 6 successful!");
        }
        else{
            System.out.println("Test 6 unsuccessful!");
        }

//        ELEMENT 7
        w.get("https://www.thesparksfoundationsingapore.org/links/ai-in-education/");
        w.manage().window().maximize();

        String actual_cus = w.getTitle();
        String estimated_cus = "The Sparks Foundation | Home";


        if(actual_cus.equalsIgnoreCase(estimated_cus)){
            System.out.println("Test 7 successful!");
        }
        else{
            System.out.println("Test unsuccessful!");
        }
////        ELEMENT 8
//        w.get("");
//        w.manage().window().maximize();
//
//        String actual_ = w.getTitle();
//        String estimated_ = "The Sparks Foundation | Home";
//
//
//        if(actual_title.equalsIgnoreCase(estimated_title)){
//            System.out.println("Test successful!");
//        }
//        else{
//            System.out.println("Test unsuccessful!");
//        }
////        ELEMENT 9
//        w.get("");
//        w.manage().window().maximize();
//
//        String actual_ = w.getTitle();
//        String estimated_ = "The Sparks Foundation | Home";
//
//
//        if(actual_title.equalsIgnoreCase(estimated_title)){
//            System.out.println("Test successful!");
//        }
//        else{
//            System.out.println("Test unsuccessful!");
//        }
////        ELEMENT 10
//        w.get("");
//        w.manage().window().maximize();
//
//        String actual_ = w.getTitle();
//        String estimated_ = "The Sparks Foundation | Home";
//
//
//        if(actual_title.equalsIgnoreCase(estimated_title)){
//            System.out.println("Test successful!");
//        }
//        else{
//            System.out.println("Test unsuccessful!");
//        }


        w.close();
    }
}
