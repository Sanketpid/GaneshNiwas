package Exelstudy;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Myexelcode3 {

	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream Myfile= new FileInputStream("C:\\11th dec\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(Myfile).getSheet("sheet1");
		int totalrows = sheet.getLastRowNum();
		
	for(int i=0;i<=totalrows;i++) {
             short totalcoloumn = sheet.getRow(i).getLastCellNum();
			 for(int j=0;j<=totalcoloumn-1;j++) {
			 CellType datatype = sheet.getRow(i).getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getCellType();
			 String s = datatype.toString();
			 if(s.equals("STRING")) {
				String str = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(str+"||");
				}
			else if (s.equals("NUMERIC")) {
					double str1 = sheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(str1+"||");}
			else if (s.equals("BLANK")) {
				
					  System.out.print("Blank+ || ");
				 
			}
			else {
					boolean str3 = sheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(str3+"||");}
			}
			System.out.println();
		}}}
