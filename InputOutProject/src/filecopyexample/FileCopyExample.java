package filecopyexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopyExample {
	
	public static void main(String[] args) {
		
		Path source = Paths.get("C:/Mohammad Firoz/test.txt");	
		Path dest = Paths.get("C:/Mohammad Firoz/Software/test.txt");
		
		try {
			Files.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
