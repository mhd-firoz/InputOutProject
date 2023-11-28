package pathclassexample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassExample {
	public static void main(String[] args) {
		
		Path path = Paths.get("C:/Mohammad Firoz/example.txt");
		try {
			Files.deleteIfExists(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new File("example2.txt").mkdir();
		Path path1 = Paths.get("example2.txt");
		
		System.out.println(path1.getFileName());
		System.out.println(path1.getRoot());
		System.out.println(path1.getParent());
		
		
		
		
	}

}
