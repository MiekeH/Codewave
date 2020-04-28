package stream;

public class Student extends Person {
	private static int incrementId=1;
	private int id;
	
	//other coding
//	private final int id;
//    private static final AtomicInteger count = new AtomicInteger(0);
	
	public Student() {
		//id=count.incrementAndGet();
	}
	
	public Student(String name, String lastName) {
		super(name,lastName);
		getIncrementId();
		//id=count.incrementAndGet();
	
	}

	private int getIncrementId() {
		//this.setId(this.getId() + incrementId);
		id = incrementId;
		return incrementId++; 
		
		
	}

	public String getLastName() {
		return super.getLastName();
	}
	
	public String getName() {
		return super.getName();
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

	
	
	
	
}
