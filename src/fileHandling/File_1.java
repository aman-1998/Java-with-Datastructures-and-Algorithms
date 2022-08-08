package fileHandling;

import java.io.File;
import java.io.IOException;

public class File_1 {
	
	public static void main(String[] args) throws IOException
	{
		File file = new File("StudyEasy.txt");
		file.createNewFile();
		System.out.println("File created");
	}

}
