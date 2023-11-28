package trywithresourceexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResourcesExample {
	public static void main(String[] args) {

		try(BufferedReader read = new BufferedReader(new StringReader("Hello world"));
				StringWriter writer = new StringWriter();) 
		{
			writer.write(read.readLine());
			System.out.println(writer.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
