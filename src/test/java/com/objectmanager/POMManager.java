package com.objectmanager;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pojo.BookHotelPage;
import org.pojo.BookingConfirmPage;
import org.pojo.LoginPage;
import org.pojo.SearchHotelPage;
import org.pojo.SelectHotel;

public class POMManager extends BaseClass {
	
private LoginPage loginpage;
	
	private SearchHotelPage searchhotelpage;
	
	private SelectHotel selecthotel;
	
	private BookHotelPage bookhotelpage;
	
	private BookingConfirmPage bookingconfirmpage;
	
	public POMManager(WebDriver driver){
		this.driver = driver;
	}
	
	public LoginPage getLoginpage() {
		return (loginpage==null)?new LoginPage():loginpage;
	}

	public SearchHotelPage getSearchhotelpage() {
		return searchhotelpage;
	}

	public SelectHotel getSelecthotel() {
		return selecthotel;
	}

	public BookHotelPage getBookhotelpage() {
		return bookhotelpage;
	}

	public BookingConfirmPage getBookingconfirmpage() {
		return bookingconfirmpage;
	}

	
	
	
	

}
