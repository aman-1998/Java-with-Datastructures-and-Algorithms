package fileHandling;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_14 {
	
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\DELL\\Desktop\\folder9\\folder10\\Demo2.txt");
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			char ch = (char)br.read();
			while(ch != (char)65535)
			{
				System.out.print(ch);
				ch = (char)br.read();
			}
			
			br.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(IOException e)
		{
			System.out.println("IOException occured");
		}
	}

}
