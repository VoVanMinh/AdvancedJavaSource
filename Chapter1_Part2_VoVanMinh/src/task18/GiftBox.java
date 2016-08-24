package task18;

/*
 * @Class Gift box
 * @Author: Vo Van Minh
 * @Date: 24-08-2016
 * @Version: 1.0
 */
public class GiftBox {
	String shape;
	String color;
	final int price = 10000;

	public GiftBox() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiftBox(String shape, String color) {
		super();
		this.shape = shape;
		this.color = color;
	}

	//to print information of a gift box.
	@Override
	public String toString() {
		return "---" + shape + "\n---" + color + "\n---";
	}

	public class Gift {
		String name;
		float weight;
		final int FEE = 200;

		public Gift(String name, float weight) {
			super();
			this.name = name;
			this.weight = weight;
		}
		public Gift(float weight) {
			super();
			this.weight = weight;
		}
		/*
		 *  Calculate total fee send gift.
		 *  Input: weight, fee and price
		 *  Output: return total fee float type.
		 */
		public float calFee() {
			return weight * FEE + GiftBox.this.price;
		}

		//to print information of a gift.
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "---" + name + "\n---" + weight + "\n---";
		}
	}
}
