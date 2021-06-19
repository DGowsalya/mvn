package com.Automation.pom;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	
	
	
	public class Pom {
	  
		public static WebDriver driver;
		
		

		@FindBy(xpath="//a[@title='Log in to your customer account']")
		private WebElement signin_btn;
		
		
		@FindBy(xpath="//input[@id='email']")
		private WebElement email;
		
		
		@FindBy(xpath="//input[@id='passwd']")
		private WebElement pass;
		
		@FindBy(xpath="//button[@name='SubmitLogin']")
		private WebElement login;
		
		
		
		
		@FindBy(xpath="(//a[@title='Dresses'])[2]")
		private WebElement dresses;
		
		@FindBy(xpath="(//a[@title='Casual Dresses'])[2]")
		private WebElement casual_dresses;
		
		
		@FindBy(xpath="//a[text()='S']")
		private WebElement size;
		
		
		@FindBy(xpath="//select[@id='selectProductSort']")
		private WebElement sort;
		
		
		@FindBy(xpath="//option[text()='Price: Lowest first']")
		private WebElement select_sort;
		
		
		@FindBy(xpath="//a[text()='Orange']")
		private WebElement color;
		

		@FindBy(xpath="//a[text()='Cotton']")
		private WebElement composition;
		

		@FindBy(xpath="//a[text()='Girly']")
		private WebElement style;
		
		

		@FindBy(xpath="//a[text()='Colorful Dress']")
		private WebElement properties;
		
		

		@FindBy(xpath="//a[text()='In stock']")
		private WebElement availability;
		
		
		@FindBy(xpath="//a[text()='Fashion Manufacturer']")
		private WebElement manufacturer;
		
		@FindBy(xpath="//a[text()='New']")
		private WebElement condition;
		
		@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li")
		private WebElement pic;
		
		public WebElement getPic() {
			return pic;
		}


		public WebElement getQuickview() {
			return quickview;
		}


		public WebElement getCart() {
			return cart;
		}


		@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[2]/span")
		private WebElement quickview;
		
		@FindBy(xpath="(//span[text()='Add to cart'])[1]")
		private WebElement cart;
		
		@FindBy(xpath="//a[@title='Proceed to checkout']")
		private WebElement checkout;
		
		public WebElement getCheckout() {
			return checkout;
		}


		public WebElement getCheckout1() {
			return checkout1;
		}


		public WebElement getAddress_checkout() {
			return address_checkout;
		}


		public WebElement getTerms_agree() {
			return terms_agree;
		}


		public WebElement getShipping_checkout() {
			return shipping_checkout;
		}


		public WebElement getPayment() {
			return payment;
		}


		public WebElement getOder_confirm() {
			return oder_confirm;
		}


		public WebElement getScroll() {
			return scroll;
		}


		@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
		private WebElement checkout1;
		
		@FindBy(xpath="//button[@name='processAddress']")
		private WebElement address_checkout;
		
		
		@FindBy(xpath="//input[@type='checkbox']")
		private WebElement terms_agree;
		
		@FindBy(xpath="//button[@name='processCarrier']")
		private WebElement shipping_checkout;
		
		@FindBy(xpath="//a[@title='Pay by bank wire']")
		private WebElement payment ;
		
		@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
		private WebElement oder_confirm;
		
		@FindBy(xpath="//div[@class='box']")
		private WebElement scroll;
		
	  
		
		public WebElement getLogin() {
			return login;
		}


		public WebElement getDresses() {
			return dresses;
		}


		public WebElement getCasual_dresses() {
			return casual_dresses;
		}


		public WebElement getSize() {
			return size;
		}


		public WebElement getSort() {
			return sort;
		}


		public WebElement getSelect_sort() {
			return select_sort;
		}


		public WebElement getColor() {
			return color;
		}


		public WebElement getComposition() {
			return composition;
		}


		public WebElement getStyle() {
			return style;
		}


		public WebElement getProperties() {
			return properties;
		}


		public WebElement getAvailability() {
			return availability;
		}


		public WebElement getManufacturer() {
			return manufacturer;
		}


		public WebElement getCondition() {
			return condition;
		}
	

		public static WebDriver getDriver() {
			return driver;
		}


		public WebElement getSignin_btn() {
			return signin_btn;
		}


		public WebElement getEmail() {
			return email;
		}


		public WebElement getPass() {
			return pass;
		}	
		
	}



