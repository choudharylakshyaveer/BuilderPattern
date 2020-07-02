package builderPattern;


public final class Student {

	private final int id; 
	private final String name; 
	private final String address;
	
	private Student(IBuilder builder) 
    { 
        this.id = builder.id;
        this.name=builder.name;
        this.address = builder.setAddress;
    } 
}
