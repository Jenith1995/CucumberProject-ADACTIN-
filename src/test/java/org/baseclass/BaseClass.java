package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	protected static WebDriver driver;
	public Actions a;
    public Select s;
	

	// to launch the Chrome Browser
	public WebDriver chromeLaunch() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
        return driver;
	}

	// to launch the url
	public void urlLaunch(String url) {

		driver.get(url);
		maximize();
		implicitWait();
	}
	
	public String currentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	// to insert the text
	public void insert(WebElement w, String value) {

		w.sendKeys(value);

	}

	// to click
	public void click(WebElement w) {

		w.click();
	}

	// to get the title
	public String title() {

		String title = driver.getTitle();
		return title;
	}

	// to make the compiler to wait
	public void sleep(long millisec) throws InterruptedException {

		Thread.sleep(millisec);

	}

	// to get text
	public String text(WebElement w) {

		String text = w.getText();
		return text;

	}

	// to get the parent id
	public String parentId() {

		String parentId = driver.getWindowHandle();
		return parentId;

	}

	// to get all windows id
	public Set<String> allWinId() {

		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;

	}

	// switch to window by id
	public void switchWindow(String id) {

		driver.switchTo().window(id);

	}

	// to add the values in the list
	public void addInList(List<String> li, Set<String> s) {

		li.addAll(s);

	}

	// to get the value in the list
	public String getList(List<String> li, int index) {

		String string = li.get(index);
		return string;
	}

	// for Xpath
	public WebElement xpath(String path) {

		WebElement xPath = driver.findElement(By.xpath(path));
		return xPath;
	}

	// to get the attribute's value
	public String attributeValue(WebElement w, String value) {

		String attribute = w.getAttribute(value);
		return attribute;

	}
	public void quit() {
		driver.quit();
		
	}

	// to perform using the tagName(if one tag is available in the webpage)
	public WebElement tagName(String tag) {

		WebElement tagDatas = driver.findElement(By.tagName(tag));
		return tagDatas;

	}

	// to perform using the tagName(if many tag is available in the webpage)
	public List<WebElement> tagNames(String tag) {

		List<WebElement> tagDataslist = driver.findElements(By.tagName(tag));
		return tagDataslist;

	}

	// For locate using name.
	public WebElement name(String name) {

		WebElement nameLocate = driver.findElement(By.name(name));
		return nameLocate;
	}

	// to locate using class name
	public WebElement className(String classname) {

		WebElement className = driver.findElement(By.className(classname));
		return className;
	}

	// Mouse Action: to move to a Element
	public void hoverToElement(WebElement w) {

		a.moveToElement(w).perform();

	}

	// make drag and drop
	public void drag(WebElement src, WebElement des) {

		Actions a = new Actions(driver);
		a.dragAndDrop(src, des);

	}

	// for Double Click
	public void doubleClick(WebElement w) {

		Actions a = new Actions(driver);
		a.doubleClick(w).perform();
	}

	// to make Context Click(Right Click)
	public void rightClick(WebElement w) {

		Actions a = new Actions(driver);
		a.contextClick(w).perform();

	}

	// to make Robot actions(KeyBoard actions)
	public void keyBoardActions() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// to accept in alert

	public void okAlert() {

		Alert a = driver.switchTo().alert();

		a.accept();

	}

	// to cancel the alert

	public void cancelAlert() {

		Alert a = driver.switchTo().alert();

		a.dismiss();
	}

	// to take Screenshot and save in a particular loc

	public void screenshot(String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File snap = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenTopic\\screenshot\\" + name + ".png ");
		FileUtils.copyFile(snap, f);

	}

	// to switch to a frame by indexx

	public void frameByIndex(int index) {

		driver.switchTo().frame(index);

	}

	// to switch to a frame by name

	public void frameByName(String name) {

		driver.switchTo().frame(name);

	}

	// to switch to a frame by using id

	public void frameById(String id) {

		driver.switchTo().frame(id);

	}

	// to switch a frame by using the Web Element

	public void frameByElement(WebElement ref) {

		driver.switchTo().frame(ref);

	}

	// to switch to a Immediate parent frame

	public void switchParentFrame() {

		driver.switchTo().parentFrame();

	}

	// to switch to a main window frame

	public void switchDefaultContent() {

		driver.switchTo().defaultContent();

	}

	// to scroll down

	public void scrollDown(WebElement w) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", w);

	}

	// to Scroll up

	public void scrollUp(WebElement w) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(false)", w);

	}

	// to send a value in text Field using javaScript

	public void setattribute(String name, WebElement w) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value', ' " + name + " ')", w);

	}

	// to click using javascript

	public void clickInJavaScript(WebElement w) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", w);

	}

	// to getAttribute value using javascript

	public String getAttJava(String arg, WebElement w) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String value = js.executeScript(arg, w).toString();
		return value;

	}

	// to pass the location of the file

	public File file(String loc) {

		File f = new File(loc);
		return f;

	}

	// to pass the Read the excel

	public FileInputStream readExcel(File f) throws FileNotFoundException {

		FileInputStream fInput = new FileInputStream(f);
		return fInput;

	}

	// to Navigate to the Excel

	public Workbook excelNavigate(FileInputStream fInput) throws IOException {

		Workbook w = new XSSFWorkbook(fInput);
		return w;
	}

	// to get the sheet from the excel

	public Sheet getSheet(Workbook w, String arg) {

		Sheet s = w.getSheet(arg);
		return s;

	}

	// to get the row from the Excel

	public Row getRow(Sheet s, int index) {

		Row r = s.getRow(index);
		return r;

	}

	// to get the cell for the Excel

	public Cell getCell(Row r, int index) {

		Cell c = r.getCell(index);
		return c;

	}

	// to get number of rows with value from the excel

	public int rowswithvalue(Sheet s) {

		int rows = s.getPhysicalNumberOfRows();
		return rows;

	}

	// to get number of cells with value in excel

	public int cellswithvalue(Row r) {

		int cells = r.getPhysicalNumberOfCells();
		return cells;

	}

	// to get the particular cell value using rnum and cnum

	public String readValueInExcel(String name , String sheet , int rownum, int columnnum) throws IOException {
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenTopic\\Excel\\"+ name +".xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet(sheet);
		
		Row r = s.getRow(rownum);
		
		Cell c = r.getCell(columnnum);
		
        int type = c.getCellType();
		
		if (type == 1 ) {
			
			String value = c.getStringCellValue();
			return value;
			
		}else if (DateUtil.isCellDateFormatted(c)) {
			
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
			String value = sim.format(d);
			return value;
		}else {
			
			double d = c.getNumericCellValue();
			long l = (long)d;
			String value = String.valueOf(l);
			return value;
		
	}
		
	}

	// to get all the values in the excel

	public String allValuesInExcel(String name, String sheet) throws IOException {
		 String val = null ;
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenTopic\\Excel\\" + name + ".xlsx");
		FileInputStream finput = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(finput);
		Sheet s = w.getSheet(sheet);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);

				int type = c.getCellType();

				if (type == 1) {

					val = c.getStringCellValue();
					System.out.println(val);					
					
				} else if (DateUtil.isCellDateFormatted(c)) {

					Date d = c.getDateCellValue();
					SimpleDateFormat setFormat = new SimpleDateFormat("MM/dd/yyyy");
					val = setFormat.format(d);
					System.out.println(val);
					

				} else {

					double d = c.getNumericCellValue();
					long l = (long) d;
					val = String.valueOf(l);
					System.out.println(val);										
				}				
			}				
		}
		return val;
		
		
	}	
	
	// to maximize the window
		public void maximize() {

			driver.manage().window().maximize();

		}

		// for implicit wait
		public void implicitWait() {

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}

		public void selectByText(WebElement e, String text) {

			// Select s = new Select(e);
			// s.selectByVisibleText(text);
			// this can be written as

		s = new Select(e);
				s.selectByVisibleText(text);
		}

		public void selectByIndex(WebElement e, int index) {

			// Select s = new Select(e);
			// s.selectByVisibleText(text);
			// this can be written as

			new Select(e).selectByIndex(index);

		}

		public void selectByAttribute(WebElement e,String value) {

			// Select s = new Select(e);
			// s.selectByVisibleText(text);
			// this can be written as

			new Select(e).selectByValue(value);

		}
}
