package org.automationtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//private JavascriptExecutor driver;

public class POCXmlizerTest {
	@Test
	public void launch() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "P:\\PRASAD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://docs.oracle.com/cd/E13194_01/pages/docs15/admin/dataspaces_records.html");

		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,1000)","");
		 */

		// String xpath = "//*[@id=\\\"wp1075254table1075252\\\"]/tbody/tr[3]/td[2]";

		int i = 1;
		int tr = 2;
		int td = 1;

		while (i < 12) {

			String text = driver1.findElement(By.xpath("//*[@id=\"wp1075254table1075252\"]/tbody/tr[" + tr + "]/td[" + td + "]/div")).getText();
			System.out.println(text);
			td++;

			String text1 = driver1.findElement(By.xpath("//*[@id=\"wp1075254table1075252\"]/tbody/tr[" + tr + "]/td[" + td + "]/div")).getText();
			System.out.println(text1);
			tr++;
			td--;
			i++;	

			/*
			 * if (text == text1) { System.out.println("Test pass"); }
			 */
			
			//*[@id="site-content"]/div[2]/div/div[5]/div[2]/div/div/div[1]/div/div[3]/div[7]/span[1]/div/div[2]
			//*[@id="site-content"]/div[2]/div/div[5]/div[2]/div/div/div[1]/div/div[3]/div[7]/span[2]/div/div[2]
			//*[@id="site-content"]/div[2]/div/div[5]/div[2]/div/div/div[1]/div/div[3]/div[7]/span[3]/div/div[2]
			
			//*[@id="site-content"]/div[2]/div/div[5]/div[2]/div/div/div[1]/div/div[3]/div[7]/span[2]/div/div[2]
		
		}

	}

}
