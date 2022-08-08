package fileHandling;

import java.io.File;

public class File_7 {
	
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\DELL\\Desktop\\folder7\\folder8");
		file.mkdirs();
		System.out.println("Directories created");
	}

}
