package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class B {
public static void main(String[] args) throws Throwable {
	
	FileInputStream file=new FileInputStream("C:\\Users\\ABC\\Documents\\ankush.xlsx");
	double data = WorkbookFactory.create(file).getSheet("ankush").getRow(0).getCell(0).getNumericCellValue();
	System.out.println(data);
	//string
	 String data1 = WorkbookFactory.create(file).getSheet("ankush").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
    //boolean
		boolean data2 = WorkbookFactory.create(file).getSheet("ankush").getRow(1).getCell(1).getBooleanCellValue();
		System.out.println(data2);
		
}
}
