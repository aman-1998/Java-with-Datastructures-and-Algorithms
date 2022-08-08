package fileHandling;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class File_16 {
	
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\DELL\\Desktop\\folder9\\folder10\\Demo3.txt");
		file.createNewFile();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write("Great India");
		bw.newLine();
		bw.write("Emerging power");
		bw.close();
		
		try
		{
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext() == true)
				System.out.println(sc.nextLine());
			System.out.println("----------------------------------------");
			
			sc.close();
			
			sc = new Scanner(file);
			
			while(sc.hasNext() == true)
				System.out.print(sc.next()+" ");
			
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File is not found");
		}
	}
}
