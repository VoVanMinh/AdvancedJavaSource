package builderpattern;

public class Main {
	public static void main(String[] args) {
		AddressDirector director = new AddressDirector();
		USAddressBuilder b = new USAddressBuilder();
		director.Contruct(b, "Street 01", "City 01", "Region 01");
	}
}
