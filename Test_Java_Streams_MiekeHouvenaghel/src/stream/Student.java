package stream;

public class Student extends Person {
	private static int incrementId=1;
	private int id;
	
	
	
	public Student() {
		
	}
	
	public Student(String name, String lastName) {
		super(name,lastName);
		getIncrementId();
	
	}

	private int getIncrementId() {
		//this.setId(this.getId() + incrementId);
		id = incrementId;
		return incrementId++; 
		
		
	}

	public String getLastName() {
		return super.getLastName();
	}
	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

	
	
	
	
}
