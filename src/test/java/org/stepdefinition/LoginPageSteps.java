package org.stepdefinition;

import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pojo.LoginPage;
import org.pojo.BookHotelPage;
import org.pojo.BookingConfirmPage;
import org.pojo.SearchHotelPage;
import org.pojo.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends BaseClass {
	
	
	WebDriver driver;
	LoginPage l;
	SearchHotelPage sh;
	SelectHotel sp;
	BookHotelPage b;
	BookingConfirmPage bc;
	
	@Given("I am on the Adactin page")
	public void adactinPage() {
		
	   chromeLaunch();
	   
	   urlLaunch("http://adactinhotelapp.com/");
	    
	}
	
	@When("I should login using {string} and {string}")
	public void i_should_login_using_and(String userName, String pass) {
		
		l = new LoginPage();
		l.login(userName, pass);
	   
	}
	
	@When("I should search the hotel using {string},{string},{string},{string},{string},{string},{string},{string}")
	public void i_should_search_the_hotel_using(String location, String hotel, String roomType, String numOfRoom, String checkInDate, String checkOutDate, String adultRoom, String childRoom) {
	   sh = new SearchHotelPage();
	   sh.searchHotel(location, hotel, roomType, numOfRoom, checkInDate, checkOutDate, adultRoom, childRoom);
	   
	}


	@Then("I should select the hotel")
	public void selectTheHotel() {

		sp = new SelectHotel();
	    sp.selectHotel();
	}

	@When("I should book the hotel using  {string},{string},{string},{string},{string},{string},{string},{string}")
	public void i_should_book_the_hotel_using(String firstName, String lastName, String address, String cardNum, String ccType, String expMonth, String expYear, String cvvNum) {
	    b= new BookHotelPage();
	    b.bookHotel(firstName, lastName, address, cardNum, ccType, expMonth, expYear, cvvNum);
	}

	@When("I should get the order number")
	public void i_should_get_the_order_number() {
		bc = new BookingConfirmPage();
		String value = attributeValue(bc.getTxtOrdernum(), "value");
		System.out.println(value);
		quit();

	}

	

}
