package monthSept_December;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_The_Multiple_Data_From_The_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream fis =new FileInputStream("./data/ravidata.xlsx");

		Workbook wb=WorkbookFactory.create(fis);
		int count = wb.getSheet("Sheet1").getLastRowNum();

		for(int i=1;i<=count;i++)
		{
			String	un=wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			String psd = wb.getSheet("Sheet1").getRow(i).getCell(2).getStringCellValue();
			System.out.println(un+"   "+psd);
		}




	}

}
