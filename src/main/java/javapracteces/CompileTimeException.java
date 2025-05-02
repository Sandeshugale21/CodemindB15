package javapracteces;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("c:/text.txt");
		FileInputStream fileInputStream =new FileInputStream(file);
	}

}
