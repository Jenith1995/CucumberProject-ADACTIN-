package org.revision;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class DataDrivenUsngLib extends DataDrivenLib {
	
	@Test
	public void excelRead() throws IOException {
		Cell c;
		DataDrivenUsngLib d = new DataDrivenUsngLib();
//	File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\CucumberClas\\Excel\\InputDatas.xlsx");
		File fi=fileCreate();
		//File f = new File("D:\\Document\\InputDatas.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Sheet2");
		for (int j = 0; j < 5; j++) {
			Row r = s.createRow(j);
			for (int i = 0; i < 5; i++) {
							
			c = r.createCell(i);
			c.setCellValue("jeni");
			}
		}
		FileOutputStream fOut = new FileOutputStream(fi);
		w.write(fOut);
		
	Cell ce = d.excelRead(fi, "Sheet2", 1, 2);
	System.out.println(ce);
	
	}
}
