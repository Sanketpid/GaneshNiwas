package Exelstudy;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Blank {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile= new FileInputStream("C:\\11th dec\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(Myfile).getSheet("sheet6");
		 CellType type = sheet.getRow(0).getCell(1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getCellType();
		System.out.println(type);
		

	}

}
