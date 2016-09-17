package transaction;

import java.util.Date;;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 18, 2016
 */
public class Product {
	int id;
	String name;
	double price;
	int amount;
	String image;
	int categoryId;
	Date createDate;
	int onSell;

	public Product(String name, double price, int amount, String image, int categoryId, Date createDate, int onSell) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.image = image;
		this.categoryId = categoryId;
		this.createDate = createDate;
		this.onSell = onSell;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getOnSell() {
		return onSell;
	}

	public void setOnSell(int onSell) {
		this.onSell = onSell;
	}

}
