package filaHandling;

import java.io.File;
import java.io.IOException;

public class FileIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("newFile.txt");
		try {
		boolean result =file.createNewFile();
		if(result) {
			System.out.println("File created");
			
		}else {
			System.out.println("error");
		}
		}
		catch (IOException e) {
			System.out.println("exception occurs");
		}
	}

}
