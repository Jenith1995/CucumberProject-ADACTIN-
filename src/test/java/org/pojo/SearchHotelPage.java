package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "location" )
	private WebElement ddnLocation;
	
	@FindBy(id = "hotels")
	private WebElement ddnHotels;
	
	@FindBy(id = "room_type")
	private WebElement ddnRoomType;
	
	@FindBy(id = "room_nos")
	private WebElement ddnNumOfRoom;
	
	@FindBy(id = "datepick_in")
	private WebElement txtCheckinDate;
	
	@FindBy(id = "datepick_out")
	private WebElement txtCheckoutDate;
	
	@FindBy(id = "adult_room")
	private WebElement ddnAdultRoom;
	
	@FindBy(id = "child_room")
	private WebElement ddnChildRoom;
	
	@FindBy(id = "Submit")
	private WebElement btnSearch;

	

	public WebElement getDdnLocation() {
		return ddnLocation;
	}

	public WebElement getDdnHotels() {
		return ddnHotels;
	}

	public WebElement getDdnRoomType() {
		return ddnRoomType;
	}

	public WebElement getDdnNumOfRoom() {
		return ddnNumOfRoom;
	}

	public WebElement getTxtCheckinDate() {
		return txtCheckinDate;
	}

	public WebElement getTxtCheckoutDate() {
		return txtCheckoutDate;
	}

	public WebElement getDdnAdultRoom() {
		return ddnAdultRoom;
	}

	public WebElement getDdnChildRoom() {
		return ddnChildRoom;
	}
	
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	public void searchHotel(String location, String hotel, String roomType, String numOfRoom, String checkInDate, String checkOutDate, String adultRoom, String childRoom) {
		
		selectByText(getDdnLocation(), location);
		selectByText(getDdnHotels(), hotel);
		selectByText(getDdnRoomType(), roomType);
		selectByText(getDdnNumOfRoom(), numOfRoom);
		insert(getTxtCheckinDate(), checkInDate);
		insert(getTxtCheckoutDate(), checkOutDate);
		selectByText(getDdnAdultRoom(), adultRoom);
		selectByText(getDdnChildRoom(), childRoom);
		click(getBtnSearch());
		
		
	
	}	

}
