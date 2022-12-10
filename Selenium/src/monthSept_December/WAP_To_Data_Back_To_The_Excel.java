package monthSept_December;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WAP_To_Data_Back_To_The_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("‪D:\\testscript.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		
		
		wb.getSheet("test1").getRow(1).getCell(2).setCellValue("pass");
		
		FileOutputStream fos=new FileOutputStream("D:\\\\testscript.xlsx");
		wb.write(fos);
		wb.close();


	}

	
	

}
