package fileHandling;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class File_13 {
	
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\DELL\\Desktop\\folder9\\folder10\\Demo2.txt");
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = "";
			
			line = br.readLine();
			while(line != null) 
			{
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File is not found");
		}
		catch(IOException e)
		{
			System.out.println("IOException occured");
		}
	}

}
