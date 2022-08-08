package fileHandling;

import java.io.File;

public class File_3 {
	
	public static void main(String[] args)
	{
		File file = new File("folder1");
		file.mkdir();
		System.out.println("Directory created");
	}

}
