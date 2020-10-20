package org.revision;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenLib {

	public Cell excelRead(File f, String name, int rNum, int cNum) throws IOException {
		// File f = new File(System.getProperty("user.dir")+
		// "\\Excel\\InputDatas.xlsx");
		FileInputStream fIn = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.getSheet(name);
		Row r = s.getRow(rNum);
		Cell c = r.getCell(cNum);
		return c;

	}

	public File fileCreate() {

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\CucumberClas\\Excel\\JEni.xlsx");
		return f;
	}

}
