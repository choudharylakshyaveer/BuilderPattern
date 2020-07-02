package builderPattern;

public interface IBuilder {


	IBuilder setId(int id);
	IBuilder name(String name);
	IBuilder setAddress(String address);
	Student build();
}
