package selenium.browser.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTesting {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\HP\\Desktop\\Automation Testing\\crome driver");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.getTitle();
//		Thread.sleep(1000);
//		driver.get("https://www.facebook.com/?stype=lo&deoia=1&jlou=Afc226KNc9NfGk4RNapkTFT1vtKWZkn3IzN2GUPRItr_zR6gTpsPyhO7NhelLW2Lg89v7pN1s_0yNzKMYLb2CXl6OpLToxcDTStvHUdnyJtvRQ&smuh=2216&lh=Ac9HRexx6p13rvm8CvU");
//		
//		driver.findElement(By.id("email")).sendKeys("krishnasharma9793");
//		
//		driver.findElement(By.id("pass")).sendKeys("ktlove777");
//		
//		driver.findElement(By.name("login")).click();
//		
		
		
		
//		driver.getTitle();
//		Thread.sleep(2000);
//		driver.get("https://www.wikipedia.org/");
//		Thread.sleep(2000);
//		driver.get("https://www.mozilla.org/en-US/firefox/new/");
//		Thread.sleep(1000);
//		driver.get("https://www.w3schools.com/");
//		Thread.sleep(1000);
//		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiZ1L3x2JODAxW4qWYCHVyaCDMYABABGgJzbQ&ase=2&gclid=Cj0KCQiAsvWrBhC0ARIsAO4E6f9j_VO7j4hD7m4FprnPq9bdv_N0T8JHK63lNxaer4-KeIeUcmAl1i8aAnSfEALw_wcB&ohost=www.google.com&cid=CAESVeD2jDlehfdfHTNxg-U5wxl1gnscXlryOVzgyEnfHzRqrhOVTnMxBA5fDgT_FgRYwxI3UA9nS5i92-1tw-l-Q15bLIgFCLDsHJzBDHtzXp6dtTiT0as&sig=AOD64_2If8lFXTAKQ5vonDqTrPQH82PI3A&q&nis=4&adurl&ved=2ahUKEwji9bbx2JODAxX6SmwGHfFgDGAQ0Qx6BAgOEAM");
//		System.out .println(driver.getTitle());
		
		System.setProperty("webdriver.Firefox.driver", "webdriver.Chrome.driver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.getTitle();
		System.out.println(		driver.getTitle());
		}

}
