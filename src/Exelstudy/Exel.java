package Exelstudy;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream Myfile= new FileInputStream("C:\\11th dec\\Book1.xlsx");
	
	Sheet sheet = WorkbookFactory.create(Myfile).getSheet("sheet1");
	
	int totalrows = sheet.getLastRowNum();

	for(int i=0;i<=totalrows;i++) {
		
		short totalcoloumn = sheet.getRow(i).getLastCellNum();
		
		for(int j=0;j<=totalcoloumn-1;j++) {
			Cell sanket = sheet.getRow(i).getCell(j);
		System.out.print(sanket+"===>>>>"); {
				
			}
			}
		System.out.println();
	}
}
}
