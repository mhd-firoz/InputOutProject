package bufferreaderexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {
	
	public static void main(String[] args) {
		
		File myFile = new File("C:/Mohammad Firoz/example.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(myFile));
			
			String line ;
			while((line= reader.readLine()) != null)
			{
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
