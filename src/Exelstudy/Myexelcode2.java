package Exelstudy;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Myexelcode2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile= new FileInputStream("C:\\11th dec\\\\Book1.xlsx");
		 Row row1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0);
		String name = row1.getCell(0).getStringCellValue();
		String surname=row1.getCell(1).getStringCellValue();
		double number = row1.getCell(2).getNumericCellValue();
		System.out.println(name);
		System.out.println(surname);
		System.out.println(number);
		
		

	}

}
