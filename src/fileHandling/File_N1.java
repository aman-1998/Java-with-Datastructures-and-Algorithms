package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_N1 {
	public static void main(String[] args) {
		File file = new File("G:\\test1\\test2");
		file.mkdirs(); // mkdirs()
		System.out.println("Directories created");
		file = new File("G:\\test1\\test2\\Demo.txt");
		try {
			file.createNewFile(); // createNewFile()
			System.out.println("File created");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("Ranking of top 5 students:-\n"); // write()
			bw.write("1. Aman Kumar Mishra\n");
			bw.write("2. Alka Prasad\n");
			bw.write("3. Mala Das\n");
			bw.write("4. Sitara Choubey");
			bw.newLine(); // newLine()
			bw.write("5. Jyoti Pandit");
			bw.close(); // close()
			System.out.println("Writing on file done");
			
			Scanner in = new Scanner(System.in);
			System.out.print("Enter total number of students in the class: ");
			int total = in.nextInt();
			bw = new BufferedWriter(new FileWriter(file, true/*append mode*/));
			bw.write("\n----------------------------------------------------\n");
			bw.write("Total no. of students in the class = " + total);
			bw.close();
			System.out.println("----------------------------------------------------\n");
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			System.out.println("File: "+file.getName()); // getName()
			System.out.println("---------------------------");
			String line = br.readLine(); // readLine()
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close(); // close()
			System.out.println("----------------------------------------------------\n");
			
			br = new BufferedReader(new FileReader(file));
			System.out.println("File: "+file.getName());
			System.out.println("---------------------------");
			int charInt = br.read(); // read()
			while(charInt != -1) {
				System.out.print((char)charInt);
				charInt = br.read();
			}
			br.close();
		} catch(FileNotFoundException e) {
			System.out.println("File Not found");
		}catch (IOException e) {
			System.out.println("Demo.txt can't be created");
		} 
		
		
		
		
	}
}
