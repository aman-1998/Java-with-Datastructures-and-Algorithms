package fileHandling;

import java.io.File;

public class File_5 {
	
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\DELL\\Desktop\\folder3");
		file.mkdir();
		System.out.println("Directory created");
	}

}
