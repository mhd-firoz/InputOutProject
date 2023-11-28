package filecreationExample;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {
	
	public static void main(String[] args) {
		File file = new File("C:/Mohammad Firoz/examplefile.txt");
		try {
			boolean fileCreated =file.createNewFile();
			
		System.out.println(fileCreated);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
