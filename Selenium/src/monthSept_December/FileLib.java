package monthSept_December;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileLib 
{

	public String getPropertdata(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/ravidata.xlsx");
		Properties p =new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

}

