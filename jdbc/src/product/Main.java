package product;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 17, 2016
 */
public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		CategoryController categoryC = new CategoryController();
		ProductController productC = new ProductController();

		try {
			categoryC.getCategoryList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		int choose = -1;
		while (choose != 0) {
			try {
				if (categoryC.list.size() == 0) {
					System.out.println("---Category is empty. \n---Exit.");
					System.exit(0);
				}
				choose = menuMain();
				switch (choose) {
				// product list
				case 1:
					productC.getProductList();
					productC.printList();
					break;
				// insert a product
				case 2:
					categoryC.printList();
					Product product = Product.getProduct();
					product.setCategoryID(categoryC.getCategoryID());
					productC.insertProduct(product);
					break;
				// search product by name
				case 3:
					System.out.println("Enter product name you want to find: ");
					String name = input.readLine();
					productC.searchProduct(name);
					if (productC.list.size() == 0)
						System.out.println("---Cannot find product.");
					else
						productC.printList();
					break;
				// update a product
				case 4:
					productC.getProductList();
					productC.printList();
					Product pt = productC.chooseProduct();
					if (pt != null) {
						System.out.println("Enter update price: ");
						float price = Float.parseFloat(input.readLine());
						System.out.println("Enter update amount: ");
						int amount = Integer.parseInt(input.readLine());

						pt.setPrice(price);
						pt.setAmount(amount);
						productC.updateProduct(pt);
					}
					break;
				// delete a product
				case 5:
					productC.getProductList();
					productC.printList();
					Product pr = productC.chooseProduct();
					System.out.println("You still want to delete this product? y/n: ");
					String yn = input.readLine();
					if (yn.equalsIgnoreCase("y")) {
						productC.deleteProduct(pr);
					}
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	/**
	 * @to print main menu.
	 * @return a chosen int type from keyboard.
	 */
	private static int menuMain() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int choose = -1;
		while (choose < 0 || choose > 5) {
			System.out.println("-----Main menu-----");
			System.out.println("0. Quit");
			System.out.println("1. Product list");
			System.out.println("2. Add new product");
			System.out.println("3. Search product by name");
			System.out.println("4. Update price, amount for a product");
			System.out.println("5. Delete a product");
			System.out.println("Enter a chosen: ");
			choose = input.nextInt();
		}
		return choose;
	}
}
