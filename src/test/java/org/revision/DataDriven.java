package org.revision;

import java.io.File;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.junit.Test;

public class DataDriven extends BaseClass{

	
	@Test
	public void excel() throws IOException {
		
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\CucumberClas\\Excel\\InputDatas.xlsx");
		
		String readValueInExcel = readValueInExcel(f, "Sheet2", 2, 2);
		
		System.out.println(readValueInExcel);
		
	}
}
