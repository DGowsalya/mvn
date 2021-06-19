package com.Automation.base;
	  import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Base
	{

		
		
		public static WebDriver driver;
		public static WebDriver getBrowser(String s)
		
		{
			if (s.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
				driver=new FirefoxDriver();	
					}
			
			else if (s.equalsIgnoreCase("chrome")) {			
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
				driver=new ChromeDriver();				
			}
			
			driver.manage().window().maximize();
			return driver;					
		}	
		public static void getUrl(String url)
		{	
			driver.get(url);
		}
		
		
		//get text
		
		public static void get_Text(WebElement element)
		{
			
			String text1 = element.getText();
			
			System.out.println("get text:"+text1);
			
			
		}
		
		
		//current url
		
		public static void current_url()
		{
			
			String currentUrl = driver.getCurrentUrl();
			System.out.println("current url:"+currentUrl);
			
				
		}
		
		
		//get title
		
		public static void get_Title()
		{
			
	    String title = driver.getTitle();
			
		System.out.println("get title:"+title);
			
		}
		
		
		
		//click 
		
		
		public static void clickonbtn(WebElement element)
		{
			
			element.click();
			
		}
		
		
		//confirm alert
		
		public static void confirm_alert(String option)
		{
			
			Alert a1 = driver.switchTo().alert();
			if (option.equalsIgnoreCase("ok")) {
				a1.accept();
				
			}
			else if (option.equalsIgnoreCase("cancel")) {
			a1.dismiss();
			}
			
			
		}
		
		// simple alert
		
		public static void simple_alert(String text) throws InterruptedException {		
		Alert a = driver.switchTo().alert();
		if (text.equalsIgnoreCase("ok")) {
		Thread.sleep(2000);
		a.accept();
		}		
		}
		
			
		//prompt alert
		
		
		public static void prompt(String text) {
			
			Alert a2 = driver.switchTo().alert();
			if (text.equalsIgnoreCase("ok")) {
				a2.accept();
			}
			else if (text.equalsIgnoreCase("cancel")) {
				
				a2.dismiss();
							
			}
			
			
		}
		
		
		
		
		// actions
		
		public static void action(WebElement element,WebElement element1) {
			Actions a=new Actions(driver);
			
			a.moveToElement(element).build().perform();	
			a.click(element1).build().perform();
					
	        }
		
			
		//another way to do action		
//		public static void action(WebElement element,WebElement element1) {
//			Actions a=new Actions(driver);
//			a.moveToElement(element).build().perform();	
//			
//					
//		}
		

		
		//displayed
		public static void display(WebElement element)
		{
			
			boolean displayed = element.isDisplayed();
			System.out.println("displayed:"+displayed);
			
			
			
		}
		
		
		
		
		//is selected
		
		public static void selected(WebElement element) {		
			boolean selected = element.isSelected();	
			System.out.println("selected:"+selected);			
		}
		
		
		// scroll down
		
		public static void scroll_down(WebElement element)
		{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
		
		
		}
		
		
		//scroll up

		public static void scroll_up(WebElement element)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",element);
					
		}
		
		
		//multiple dropdown
		
		//isMultiple
		
		
		public static void ismultiple(WebElement element) {
			Select s=new Select(element);
			boolean multiple = s.isMultiple();
			System.out.println("multiple:"+multiple);
		}
			
			
		public static void getoption(WebElement element)
		{
			Select s=new Select(element);
			List<WebElement> options = s.getOptions();
			for (WebElement option : options) {
				
				String text = option.getText();		
				System.out.println(text);
			
			}
		}
			
			
			//size
		
		public static void Size(WebElement element) {
				
				Select s=new Select(element);
				List<WebElement> options2 = s.getOptions();
				int size = options2.size();
				System.out.println(size);
					
			
		}
			
		
		//getAll Selected option
		
		
		public static void alloption(WebElement element)
		{
			
			Select s=new Select(element);
			List<WebElement> options2 = s.getOptions();
			int size = options2.size();
			System.out.println(size);		
			
			for (int i = 0; i < size; i++) {
				if(i==1 || i==3 || i==5)
				{
					s.selectByIndex(i);			
				}
				
			}
			List<WebElement> alloptions = s.getAllSelectedOptions();
			System.out.println("all selected option");
			for (WebElement alloption : alloptions) {
				String text = alloption.getText();
				System.out.println(text);
			}	
			
			
			
			
		}
		
		
		//get first selected option
		
		public static void firstoption(WebElement element)
		{
			Select s=new Select(element);
			List<WebElement> options = s.getOptions();
			int size = options.size();	
			System.out.println(size);
			for (int i = 0; i <size; i++) {
				if(i==1||i==5||i==6)
				{                                                        
					s.selectByIndex(i);
					
				}			
			}
					WebElement firstSelectedOption = s.getFirstSelectedOption();
					String text = firstSelectedOption.getText();
					System.out.println(text);
			}
		

		//context click
		
		
		public static void context(WebElement element)
		{
			Actions a=new Actions(driver);
			a.contextClick(element).build().perform();
			
		
		}
		
		
		
		//robot
	//	
		
		public static void robot(WebElement element,WebElement element1,String option) throws AWTException
		{
			Actions a=new Actions(driver);
			a.moveToElement(element).build().perform();	
	  	    a.contextClick(element1).build().perform();
			
			Robot r=new Robot();
			if (option.equalsIgnoreCase("up")) {
				r.keyPress(KeyEvent.VK_UP);
				r.keyPress(KeyEvent.VK_UP);	
			}
			else if (option.equalsIgnoreCase("down")) {	
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);	
			}	
	          				
		}
		
//		robot enter
		
		public static void robo_enter() throws AWTException
		{
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);	
			
			
		}
		
		
		
		
		//single frame 
		
		public static void frame(WebElement element) 
		{
				
			driver.switchTo().frame(element);
			
		}
		
		//default content 
		
		public static void default_content()
		{
			driver.switchTo().defaultContent();
			
				
		}
		
		
		//send keys
		
		public static void Send_Keys(WebElement element,String s1)
		{
			element.sendKeys(s1);		
			
		}

		
		//attribute
		
		
	  public static void attribute(WebElement element,String text,String text1)
	  { 
		  
	String attribute = element.getAttribute(text);   // text---->it is value it prints the value that we have passed eg:"gow@gmail.com".
	System.out.println("attribute:"+attribute);
	String attribute2 = element.getAttribute(text1);   // text1--->we have given id so it prints the id maybe email or some other id
	System.out.println("attribute2:"+attribute2);

	}
	   
		
		// is enabled
		
		
	   public static void enable(WebElement element)
	   {
	boolean enabled = element.isEnabled();
	System.out.println("enabled:"+enabled);

	  }


	//clear
	   
	   
	   
	public static void clear(WebElement element)
		
	{

	element.clear();

	}
		

		
		//wait
		
		//implicit wait
		
		public static void implicit(int value)
		{
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
			
		}
		
		
		
		//explicit wait
		
		public static void explicit(int val,WebElement element) {
			
			WebDriverWait wait=new WebDriverWait(driver, val);
			wait.until(ExpectedConditions.invisibilityOf(element));
					
		}
		
			
		
		//fluent wait
		
//		public static fluent(int val,WebElement element)
//		{
//			Wait wait=new FluentWait(input).withTimeout(val,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);	
//		}
		
		
		
		
		
		
		
		//screenshot
		
		public static void Screenshot(String path) throws IOException {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination=new File(path);
			FileUtils.copyFile(source, destination);			
		}
		
		
		
		//close
		
		public static void close()
		{
			driver.close();
		}
		
		
		//quit
		
		public static void quit()
		{
			driver.quit();
		}
		
		
		
		
		//single dropdown
		
	//	
		public static void Single_Select(WebElement element,String text,String option)
		{
			Select s=new Select(element);                                                                           //  ---->what we are going to select whether the day,month or year
			if (option.equalsIgnoreCase("value"))                                                                  // ---->option ----> to select the value like SelectByValue,SelectByVisibleText,SelectByIndex
			{
				s.selectByValue(text);                                                                            //------->We will be passing the text like year means for eg 2001,month means "Dec",day means "28"
							
			}
			else if (option.equalsIgnoreCase("text")) {
				
				s.selectByVisibleText(text);		
				
			}
			else if (option.equalsIgnoreCase("index")) 
			{
				int parseInt=Integer.parseInt(text);
				s.selectByIndex(parseInt);
				
		}
		}

	//	
	//Navigate to
		
		public static void NavigateTo(String url)
		{
			
			driver.navigate().to(url);		
			
		}
		
		
		// Navigate back
		
		public static void Navigateback()
		{
			
			driver.navigate().back();
		}
		 
		
		
		// navigate forward
		
		public static void Navigatefoward()
		{
			driver.navigate().forward();
		}
		
		
		
		//refresh
		
		public static void refresh()
		{
			driver.navigate().refresh();
		}
		

}


