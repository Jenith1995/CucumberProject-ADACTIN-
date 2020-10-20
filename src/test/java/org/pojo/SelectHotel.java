package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[starts-with(@id,'radiobutton')]")
	private WebElement btnRadio;
	
	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	public void selectHotel() {
		click(getBtnRadio());
		click(getBtnContinue());
	}
	
	
}
