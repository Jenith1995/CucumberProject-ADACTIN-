package org.pojo;

import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtFirst;

	@FindBy(id = "last_name")
	private WebElement txtLast;

	@FindBy(id = "address")
	private WebElement txtAddress;

	@FindBy(id = "cc_num")
	private WebElement txtCardno;

	@FindBy(id = "cc_type")
	private WebElement ddnCcType;

	@FindBy(id = "cc_exp_month")
	private WebElement ddnExpMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement ddnExpYear;

	@FindBy(id = "cc_cvv")
	private WebElement txtCvv;

	@FindBy(id = "book_now")
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

	public void bookHotel(String firstName, String lastName, String address,
			io.cucumber.datatable.DataTable dataTable) {

		insert(getTxtFirst(), firstName);
		insert(getTxtLast(), lastName);
		insert(getTxtAddress(), address);
		
		List<Map<String, String>> val = dataTable.asMaps();
		Map<String, String> in = val.get(1);
		String cardNum = in.get("ccNo");
		insert(getTxtCardno(), cardNum);
				
		String ccType = in.get("ccType");
		selectByText(getDdnCcType(), ccType);
				
		String expMonth = in.get("expMonth");
		selectByText(getDdnExpMonth(), expMonth);
				
		String expYear = in.get("expYear");
		selectByText(getDdnExpYear(), expYear);
				
		String cvvNumber = in.get("cvvNumber");
		insert(getTxtCvv(), cvvNumber);
		click(getBtnBookNow());

	}

}
