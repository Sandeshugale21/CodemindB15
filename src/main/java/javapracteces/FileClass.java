package javapracteces;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Dell\\Documents\\SANDESH\\Notes\\testing.txt");
		file.createNewFile();
		// file.delete();

		System.out.println(file.length());
		System.out.println(file.getPath());
		System.out.println(file.canExecute());
		System.out.println(file.exists());
		System.out.println(file.getName());
		System.out.println(file.isFile());

		// File Writing
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("Welcome");
		fileWriter.close();
		System.out.println(file.length());

		// File Reading
		FileReader fileReader = new FileReader(file);

		int i;
		while ((i = fileReader.read()) != -1) {
			System.out.print((char) i);

		}
		fileReader.close();

	}

}
