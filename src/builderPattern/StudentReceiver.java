package builderPattern;

//Client Side Code 
class StudentReceiver {

	// volatile student instance to ensure visibility
	// of shared reference to immutable objects
	private volatile Student1 student;

	public StudentReceiver() throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				student = Student1.Builder.newInstance().setId(1).setName("Ram").setAddress("Noida").build();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				student = Student1.Builder.newInstance().setId(2).setName("Shyam").setAddress("Delhi").build();
			}
		});

		t1.start();
		t2.start();
		//t1.join();
		//t2.join();
		
	}

	public Student1 getStudent() {
		return student;
	}
}
