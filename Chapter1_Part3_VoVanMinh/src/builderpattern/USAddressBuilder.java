package builderpattern;

public class USAddressBuilder extends AddressBuilder{
	private Address add;
	public void buildStreet(String street) {
		add.setStreet(street);
	}
	public void buildCity(String city) {
		add.setCity(city);
	}
	public void buildRegion(String region) {
		add.setRegion(region);
	}
	public Address getAddress() {
		return add;
	}
}
