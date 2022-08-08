package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_N2 {
	public static void main(String[] args) {
		File file = new File("G:\\test1\\test2\\Demo.txt");
		File fileTemp = new File("G:\\test1\\test2\\DemoTemp.txt");
		try {
			fileTemp.createNewFile();
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileTemp));
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			String modifiedLine;
			while(line != null) {
				if(line.contains("2") && line.contains("Alka Prasad")) {
					modifiedLine = line.replace("Alka Prasad", "Geeta Purohit");
					bw.write(modifiedLine+"\n");
				} else {
					bw.write(line+"\n");
				}
				line = br.readLine();
			}
			bw.close();
			br.close();
			file.delete();
			fileTemp.renameTo(file);
			System.out.println(file.getName()+" is edited");
		} catch(FileNotFoundException e) {
			System.out.println("File Not found");
		} catch(IOException e) {
			System.out.println("Exception occured");
		}
	}
}
