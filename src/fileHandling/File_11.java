package fileHandling;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File_11 {
	
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\DELL\\Desktop\\folder9\\folder10\\Demo2.txt");
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(",");
			bw.newLine();
			bw.write("Bhulega dil jis din tumhien,");
			bw.newLine();
			bw.write("Wo din jindgi ka aakhri din hoga,");
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println("IOException occured");
		}
		
		System.out.println("Job done");
	}

}
