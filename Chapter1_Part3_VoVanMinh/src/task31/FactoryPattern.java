package task31;

/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:14:59 PM
 */
public class FactoryPattern {

	public FactoryPattern() {

	}

	public void finalize() throws Throwable {

	}

	/**
	 * to get a factory from a chosen int type.
	 * return a factory.
	 * 
	 */
	public Factory getFactory(int type) {
		switch (type) {
		case 1:
			return new TraditionalFactory();
		case 2:
			return new StylizeFactory();
		case 3:
			return new ModernFactory();
		default:
			return null;
		}
	}

}