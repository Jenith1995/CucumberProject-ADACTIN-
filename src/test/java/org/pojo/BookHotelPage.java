package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name" )
	private WebElement txtFirst;
	
	@FindBy(id = "last_name" )
	private WebElement txtLast;
	
	@FindBy(id = "address" )
	private WebElement txtAddress;
	
	@FindBy(id = "cc_num" )
	private WebElement txtCardno;
	
	@FindBy(id = "cc_type" )
	private WebElement ddnCcType;
	
	@FindBy(id = "cc_exp_month" )
	private WebElement ddnExpMonth;
	
	@FindBy(id = "cc_exp_year" )
	private WebElement ddnExpYear;
	
	@FindBy(id = "cc_cvv" )
	private WebElement txtCvv;
	
	@FindBy(id = "book_now" )
	private WebElement btnBookNow;
	
	public WebElement getTxtFirst() {
		return txtFirst;
	}

	public WebElement getTxtLast() {
		return txtLast;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCardno() {
		return txtCardno;
	}

	public WebElement getDdnCcType() {
		return ddnCcType;
	}

	public WebElement getDdnExpMonth() {
		return ddnExpMonth;
	}

	public WebElement getDdnExpYear() {
		return ddnExpYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	public void bookHotel(String firstName, String lastName, String address, String cardNum, String ccType, String expMonth, String expYear, String cvvNum) {
		
		insert(getTxtFirst(), firstName);
		insert(getTxtLast(), lastName);
		insert(getTxtAddress(), address);
		insert(getTxtCardno(), cardNum);
		selectByText(getDdnCcType(), ccType);
		selectByText(getDdnExpMonth(), expMonth);
		selectByText(getDdnExpYear(), expYear);
		insert(getTxtCvv(), cvvNum);
		click(getBtnBookNow());
	}

	
}
