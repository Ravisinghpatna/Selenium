package myPractices;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args)  {
		try {
		File f=new File("C:\\Users\\ravis\\OneDrive\\Desktop");

		
			if(f.createNewFile())
			{
				System.out.println("File create successfully");
			}
			else {
				System.out.println("File alredy exists");
			}
		}
		catch(IOException e )
		{
			System.out.println("File handled");
		}

	}

}
