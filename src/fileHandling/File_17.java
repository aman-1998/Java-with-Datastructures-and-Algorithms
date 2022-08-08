package fileHandling;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class File_17 {
	
	public static void main(String[] args) throws IOException
	{
		File file = new File("folder1\\Temporary.txt");
		
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("Aman Kumar Mishra");
			bw.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found at the specified location");
		}
		
		boolean check = file.delete();
		
		if(check == true)
			System.out.println("File deletion is successful");
		else
			System.out.println("File deletion is unsuccessful");
	}

}
