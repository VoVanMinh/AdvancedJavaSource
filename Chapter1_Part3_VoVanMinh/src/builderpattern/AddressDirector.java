package builderpattern;

public class AddressDirector {
	public void Contruct(AddressBuilder builder, String street, String city, String region) {
		builder.buildStreet(street);
		builder.buildCity(city);
		builder.buildRegion(region);
	}
}
