package Exelstudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Myexelcode {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
FileInputStream Myfile= new FileInputStream("C:\\11th dec\\\\Book1.xlsx");
Sheet sheet1 = WorkbookFactory.create(Myfile).getSheet("Sheet1");
String name = sheet1.getRow(0).getCell(0).getStringCellValue();
String surname=sheet1.getRow(0).getCell(1).getStringCellValue();
double number = sheet1.getRow(0).getCell(2).getNumericCellValue();
System.out.println(name);
System.out.println(surname);
System.out.println(number);


	
	}

}
