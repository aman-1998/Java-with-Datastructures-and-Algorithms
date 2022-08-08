package fileHandling;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File_10 {
	
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\DELL\\Desktop\\folder9\\folder10\\Demo2.txt");
		
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("Kya hua tera wada,");
			bw.newLine();
			bw.write("Wo kasam wo iraadaa");
			bw.close();
			System.out.println("Job done");
		}
		catch(IOException e)
		{
			System.out.println("IOException occured");
		}
	}

}
