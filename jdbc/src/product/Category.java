package product;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 17, 2016
 */
public class Category {
	int id;
	String name;
	String description;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// to print category info
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + id + ", " + name + ", " + description + "]";
	}

}
