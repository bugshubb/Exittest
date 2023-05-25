package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_Data_From_Excel {
	public static XSSFSheet Fetch_Data_From_Sheet() throws IOException 
	{
		File TestData_File = new File("TestData\\TestData_ExitTest_API_Demo.xlsx");
		FileInputStream inputStream = new FileInputStream(TestData_File);
		@SuppressWarnings("resource")
		XSSFWorkbook read_Data = new XSSFWorkbook(inputStream);
		XSSFSheet Fetching_Data = read_Data.getSheet("Sheet1");
		return Fetching_Data;

	}

}
