package com.myamazon.amazon;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonLoginTest {
	   String actualTitle = "";
	   String expectedTitle = "Amazon.com: Online Shopping for Electronics, "
	   		+ "Apparel, Computers, Books, DVDs & more";
	   WebDriver driver;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		

 	}

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver(); 
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void googleHomePageTest() throws InterruptedException {
		driver.get("http://amazon.com/");
        driver.findElement(By.name(("field-keywords"))).sendKeys("Books");
 		Thread.sleep(1000);
 		driver.findElement(By.cssSelector((".nav-search-submit"))).click();
 		Thread.sleep(1000);

	}
        @Test
         	public void AmazonTitle() throws InterruptedException {
     		driver.get("http://amazon.com/");
            actualTitle = driver.getTitle();
            System.out.println(actualTitle);
            if (actualTitle.contentEquals(expectedTitle)){
            	System.out.println("Test case pass");
            	
            
            } else {
                System.out.println("Test Failed");
               
            }
            	
				
 	}
	
		
	

}
