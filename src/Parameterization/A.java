package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
public static void main(String[] args) throws Throwable {
	
	FileInputStream file=new FileInputStream("C:\\Users\\ABC\\Documents\\ankush.xlsx");
	//double data = WorkbookFactory.create(file).getSheet("ankush").getRow(1).getCell().getNumericCellValue();
	//System.out.println(data);
	
	String data = WorkbookFactory.create(file).getSheet("ankush").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
	
	
}
}
