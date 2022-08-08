package fileHandling;

import java.io.File;
import java.io.IOException;

public class File_8 {
	
	public static void main(String[] args) throws IOException
	{
		File file1 = new File("C:\\Users\\DELL\\Desktop\\folder9\\folder10");
		file1.mkdirs();
		File file2 = new File("C:\\Users\\DELL\\Desktop\\folder9\\folder10\\Demo.txt");
		file2.createNewFile();
		System.out.println("Drictories and files creatted");
	}

}
