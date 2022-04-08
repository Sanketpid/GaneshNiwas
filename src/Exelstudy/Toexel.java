package Exelstudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Toexel {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
	FileInputStream myfile= new FileInputStream("C:\\11th dec\\Book2.xlsx");
	try (XSSFWorkbook workbook = new XSSFWorkbook(myfile)) {
		XSSFSheet mysheet = workbook.getSheet("Sheet1");
		FileOutputStream sanket= new FileOutputStream("C:\\11th dec\\Book2.xlsx");
		String []s= {"hitesh","shubham","shubham"};
		for(int i=0;i<s.length;i++) {
		mysheet.createRow(0).createCell(i).setCellValue(s[i]);

		}
		workbook.write(sanket);
		sanket.close();
	}
	System.out.println("sanket");
	}

}
