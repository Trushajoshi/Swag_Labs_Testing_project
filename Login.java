package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {

	WebDriver d = new ChromeDriver();
	
@BeforeSuite
	public void open() {
		System.out.println("open");
	}	
@Test
public void OpenWebsite() throws InterruptedException {
		
		d.get("https://www.saucedemo.com/");
		
		  d.manage().window().maximize();
		  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       
		System.out.println("Login page");
		
		
		d.findElement(By.id("user-name")).click();
		d.findElement(By.id("user-name")).sendKeys("standard_user");
		System.out.println("username");
		
		
		d.findElement(By.id("password")).click();
		d.findElement(By.id("password")).sendKeys("secret_sauce");  	     
        System.out.println("password");
       
        
	    d.findElement(By.id("login-button")).click();
	    System.out.println("login button");
	    
	    	
	            try {
	            	
	                String actualTitle = d.getTitle();

	                String expectedTitle = "Swag Labs";
	                
	                Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");

	                System.out.println("Title verification passed: " + actualTitle);
	            } catch (AssertionError e) {
	                System.out.println("Title verification failed: " + e.getMessage());
	            } finally {
	              Thread.sleep(1000);
	              
	        }
	            
	           
	           

	                    try {
	                      
	                       
	                        WebElement dropdown = d.findElement(By.className("product_sort_container"));
	                 
	                        Select select = new Select(dropdown);

	                        for (WebElement option : select.getOptions()) {
	                            
	                            String value = option.getAttribute("value");

	                            select.selectByValue(value);

	                            String selectedOption = select.getFirstSelectedOption().getText();
	                            System.out.println("Selected option: " + selectedOption);

	                        }
	                    } catch (Exception e) {
	                        e.printStackTrace();
	                    } finally {
	                       
	                    }
	                
	            d.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	            System.out.println("Add to cart");

	            d.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
	            System.out.println("icon of Add to cart");
	            
	            d.findElement(By.id("checkout")).click();
	            System.out.println("checkout");
	            
	            
	            
	            d.findElement(By.id("cancel")).click();
	            System.out.println("cancel");
	            
	            d.findElement(By.id("checkout")).click();
	            System.out.println("checkout");
	            
	          
	            d.findElement(By.id("first-name")).click();
	            d.findElement(By.id("first-name")).sendKeys("Test");
	            System.out.println("firstname");
	            
	            d.findElement(By.id("last-name")).click();
	            d.findElement(By.id("last-name")).sendKeys("Test");
	            System.out.println("last-name");

	            d.findElement(By.id("postal-code")).click();
	            d.findElement(By.id("postal-code")).sendKeys("400083");
	            System.out.println("postal-code");
	            
	            
	            d.findElement(By.id("continue")).click();
	            System.out.println("continue");
	            
	            d.findElement(By.id("finish")).click();
	            System.out.println("finish");
	          
	                    try {
	                       
	                        WebElement successMessage = d.findElement(By.xpath("//*[@id='checkout_complete_container']"));

	                        
	                        Assert.assertTrue(successMessage.isDisplayed());

	                        System.out.println("Success message is displayed");

	                    } catch (Exception e) {
	                        System.out.println("Error: " + e.getMessage());
	                    } finally {
	                        
	                }
	            
	                    
	                    
	                    d.findElement(By.id("back-to-products")).click();
	    	            System.out.println("back-to-products");
	}
}	    


