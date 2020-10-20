package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage extends BaseClass {

	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "order_no" )
	private WebElement txtOrdernum;

	public WebElement getTxtOrdernum() {
		return txtOrdernum;
	}
	
	
}
