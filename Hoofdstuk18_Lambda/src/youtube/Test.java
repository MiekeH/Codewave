package youtube;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub-lambda expressions through super interface Runnable

		Runnable r = () -> {
			for(int i =0; i < 10; i++) {
				System.out.println("thread lmba");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i< 10; i++) {
			System.out.println("main thread");
			
		}
		
	}

}
