package builderpattern;

public abstract class AddressBuilder {
	abstract public void buildStreet(String street);

	abstract public void buildCity(String city);

	abstract public void buildRegion(String region);
}
