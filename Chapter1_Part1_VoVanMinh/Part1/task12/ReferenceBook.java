
package task12;
/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
 */
public class ReferenceBook extends Book {
	double tax;

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		if (tax < 0 || tax > 100)
			this.tax = 0;
		this.tax = tax;
	}

	public ReferenceBook() {
		super();
	}

	public ReferenceBook(String bookID, String name, String date, double price, double amount, String publisher,
			double tax) {
		super(bookID, name, date, price, amount, publisher);
		if (tax < 0 || tax > 100)
			this.tax = 0;
		this.tax = tax;
	}

	@Override
	public double findSumPrice() {
		// TODO Auto-generated method stub
		return (amount * price) + (amount * price) * tax /100;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n--- Tax  \t: " + tax;
	}

}
