package stream;

public abstract class Person {

	private String name;
	private String lastName;
	
	public Person() {
		
	}
	
	protected Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		
	}

	@Override
	public String toString() {
		return "Person [name=" + getName() + ", lastName=" + getLastName() + "]";
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	
}
