package com.selenium.methods;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by mhasan on 2/23/17.
 */
public class SeleniumTest

{   WebDriver driver;
    String appUrl;
    String string_value;
    By locator_Id=By.id("");
    By locator_xpath=By.xpath("");
    By locator_link=By.linkText("");

    WebElement element = driver.findElement(By.id("username"));
    boolean status;
    //WebElemnt can be Text, Link, Radio Button, Drop Down, WebTable or any HTML element
    public void methods()
    {   //
        driver.get(appUrl);
        driver.getCurrentUrl();//To get current url
        driver.getPageSource();//in oder to get the page source like DOM
        driver.close();
        driver.switchTo().alert().accept();//accept ,dismiss, sendkeyes, getText methods available under alert.
        driver.switchTo().window().getWindowHandles()// for handeling more tahan one window
        driver.switchTo().frame();// you can use id, index, string 
        driver.quit();
        driver.navigate().to(appUrl);
        driver.navigate().refresh();//in order to refresh the browser
        element.clear();//If this element is a text entry element, this will clear the value
        element.sendKeys("text");//in oder to INPUT and TEXTAREA
        element.click();//to click

        element.isDisplayed();//This accepts nothing as a parameter but returns boolean value(true/false)
        boolean status = element.isDisplayed();//his method determines if an element is currently being displayed or not?

        element.isEnabled();//This accepts nothing as a parameter but returns boolean value(true/false)
        boolean status1 = element.isEnabled();//This determin                                                                   es if the element currently is Enabled or not?

        element.isSelected();//Checkboxes, Select Options and Radio Buttons.
        boolean status2 = element.isSelected();//Determine whether or not this element is selected or not.
        Select select = new Select(element);// class  to perform multiple operations on DropDown object and Multiple Select object.



        element.submit();//If this causes the current page to change, then this method will wait until the new page is loaded.

        element.getText();//This returns an innerText of the element, including sub-elements, without any leading or trailing whitespace.
        String linkText = element.getText();

        element.getTagName();
        String tagName = element.getTagName();
        //This does not return the value of the name attribute but return the tag for e.g. “input“ for the element <input name="foo"/>.

        element.getCssValue("");//Color values should bereturned as rgba strings.

        element.getAttribute(string_value);
        String attValue = element.getAttribute("id"); //This will return "string value of a attribute"

        element.getLocation();//locate the location of the element on Webpage.
        WebElement element = driver.findElement(By.id("SubmitButton"));
        Point point = element.getLocation();
        System.out.println("X cordinate : " + point.x + "Y cordinate: " + point.y);


        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //an element not found or element not visible exception because of Page loading time


    }
    @Test
    public void screenShot() throws IOException {
        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(f,new File("C:\\Users\\Mhasa\\IdeaProjects\\EdgeTech_Selenium_Methods\\src\\main\\java\\com\\selenium\\methods\\src\\main\\java\\com\\selenium\\screenShot.png"));

        //driver.findElement(By.id(""));
        //Mysql@127.0.0.1:3306
    }
}
