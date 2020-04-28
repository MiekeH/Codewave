package stream;

public abstract class Person {

	private String name;
	private String lastName;
	
	public Person() {
		
	}
	
	protected Person(String name, String lastName) {
		this.lastName = name;
		this.lastName = lastName;
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + getLastName() + "]";
	}

	public String getLastName() {
		return lastName;
	}
	
	
}
