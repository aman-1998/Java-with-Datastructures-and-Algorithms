package fileHandling;

import java.io.File;

public class File_6 {
	
	public static void main(String[] args)
	{
		File file = new File("src\\folder4\\folder5\\folder6");
		file.mkdirs();
		System.out.println("Directories created");
	}

}
