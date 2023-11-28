package scanner;

public class Person {
	
	private String name;
	private int age;
	private long phoneName;
	
	public Person(String name, int age, long phoneName) {
		super();
		this.name = name;
		this.age = age;
		this.phoneName = phoneName;		
		System.out.println("Person Created.Name:"+name + ",Age:" +age+", phone number:" +phoneName);
	}
	
	

}
