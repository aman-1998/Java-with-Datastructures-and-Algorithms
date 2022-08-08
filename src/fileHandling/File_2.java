package fileHandling;

import java.io.File;
import java.io.IOException;

public class File_2 {
	
	public static void main(String[] args) throws IOException
	{
		File file = new File("src/StudyHard.txt");
		file.createNewFile();
		System.out.println("New file created");
	}

}
