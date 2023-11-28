package directoriesexample;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Iterator;

public class DirectoriesExample {
	
	public static void main(String[] args) {
		
		FilenameFilter filter = (file,fileName)->{
			
			return fileName.contains(".");
		};
		
		String[] contents = new File(".").list(filter);
		
		for (String string : contents) {
			
			System.out.println(string);
		}
		
		new File("myDirectory").mkdir();
		
	}

}
