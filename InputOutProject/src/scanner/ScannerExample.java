package scanner;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name");
		String name =scanner.next();
		
		
		System.out.println("Enter the age");
		int age =scanner.nextInt();
		
		System.out.println("Enter the phoneNumber");
		Long phoneNumber =scanner.nextLong();
		
		Person person = new Person(name, age, phoneNumber);
		

	}
	
	
}
