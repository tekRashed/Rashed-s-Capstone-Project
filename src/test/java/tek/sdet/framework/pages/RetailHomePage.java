package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	@FindBy(xpath = "//a[@class='top-nav__logo active']")
	public WebElement logo;
		
		@FindBy(xpath = "//span[text()='All']")
		public WebElement allElement; 
		
		@FindBy(id = "cartBtn")
		public WebElement carticon;

	@FindBy(id= "signinLink")
	public WebElement signIn;
	
	@FindBy(id="accountLink")
	public WebElement account;
    
    
	@FindBy(xpath="//span[text()='All']")
	public WebElement AllElements;
	@FindBy(xpath="//span[text()='Electronics']")
	public WebElement electronicsElement;
	@FindBy(xpath="//span[text()='Computers']")
	public WebElement coputersElement;
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHomeElement;
	@FindBy(xpath="//span[text()='Sports']")
	public WebElement sportsElement;
	@FindBy(xpath="//span[text()='Automative']")
	public WebElement automativeElement;
	
	@FindBy(xpath="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBar;
	
	@FindBy(id="search")
	public WebElement allDepartment;
	@FindBy(id="searchInput")
	public WebElement seachInputField;
	@FindBy(id="searchBtn")
	public WebElement searchButton;
	@FindBy(xpath="//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutDoorPlugItem;
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement quantitySelection;
	@FindBy(xpath="//span[text()='Add to Cart']")
	public WebElement addToCartButton;
	@FindBy(id="cartQuantity")
	public WebElement cartQuantity;
	
	@FindBy(id="proceedBtn")
	public WebElement procceedToCheckout; 
	@FindBy(id="addAddressBtn")
	public WebElement addAddressBtnCheckout; 
	@FindBy(id="addPaymentBtn")
	public WebElement addPaymentBtnCheckout1;
	@FindBy(id="placeOrderBtn")
	public WebElement placeOrderBtnCheckout;
	@FindBy(xpath="//p[text()='Order Placed, Thanks]")
	public WebElement orderplacedMessage;
	
	@FindBy(xpath="//p[@class='products__name']")
	public WebElement productNameItem; 
	@FindBy(id="orderLink")
	public WebElement ordersOption;
	
	
	
	

	
	
	
    
	
	
	}	

