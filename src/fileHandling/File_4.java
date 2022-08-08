package fileHandling;

import java.io.File;
import java.io.IOException;

public class File_4 {
	
	public static void main(String[] args) throws IOException
	{
		File file = new File("src\\StudyHard2.txt");
		file.createNewFile();
		System.out.println("File created");
	}

}
