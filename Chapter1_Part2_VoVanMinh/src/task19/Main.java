package task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vo Van Minh
 * @version 1.0
 * @created 29-Aug-2016 9:22:36 AM
 */
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {

			Order order = new Order();
			ArrayList<OrderDetail> tempList = new ArrayList<OrderDetail>();
			tempList = listOrderDetail(tempList);
			if (tempList != null) {
				order = order.getOrder(tempList);
				int temp = choosePayment();
				Customer customer = new Customer();
				customer = getCutomer();
				customer.m_Order = order;

				if (temp == 2) {
					Card card = new Card();
					card = getCard();
					int temp1 = chooseCard();
					@SuppressWarnings("unused")
					double money = -1;
					if (temp1 == 1) {
						CreditCard crc = new CreditCard();
						crc = crc.getCreditCard(card);
						money = order.calTotalAmount() - crc.getMaxDebt();
						if (crc.checkMoney(order.calTotalAmount())) {
							crc.setMaxDebt(crc.getMaxDebt() - order.calTotalAmount());
							System.out.println("Infomation credit card: ");
							System.out.println(crc.toString());
							System.out.println(crc.getAuthMethod());
						} else
							System.out.println("You have not enough money! Pay later!");
					} else {
						ATMCard atm = new ATMCard();
						atm = atm.getATMCard(card);
						money = order.calTotalAmount() - atm.getBalance();
						if (atm.checkMoney(order.calTotalAmount())) {
							atm.setBalance(atm.getBalance() - order.calTotalAmount());
							System.out.println("Infomation ATM card: ");
							System.out.println(atm.toString());
							System.out.println(atm.getAuthMethod());
						} else
							System.out.println("You have not enough money! Pay later!");
					}
				}

				System.out.println("-----Order sucessful!");
				System.out.println("-----Your order:");
				System.out.println(order.toString());
				order.printListODetail();
				System.out.println("Total money: " + order.calTotalAmount());

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	// to print menu the products and return a chosen int type.
	public static int menu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		ProductManager productManager = new ProductManager();
		productManager.addListProduct();
		productManager.printList();
		int choose = -1;
		while (choose < 0 || choose > 10) {
			System.out.println("Enter 0 to quit! Enter a choosen 1->10: ");
			choose = input.nextInt();
		}
		return choose;
	}

	// to create a order detail list from the chosen of customer.
	public static ArrayList<OrderDetail> listOrderDetail(ArrayList<OrderDetail> list) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Product product = new Product();
		OrderDetail ord = new OrderDetail();
		int temp = -1;
		while (temp != 0) {
			temp = menu();
			if (temp != 0) {
				product = new Product(ProductManager.NAME[temp - 1], ProductManager.PRICE[temp - 1]);
				System.out.println("Enter quantity: ");
				int quantity = input.nextInt();
				ord = new OrderDetail(quantity, product);
				list.add(ord);
				System.out.println("\n---Add success.\n");
			}
		}
		if (list.size() == 0)
			return null;
		return list;
	}

	// to print payment form and return a chosen int type.
	public static int choosePayment() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("1. Only order");
		System.out.println("2. Order and payment");
		int temp = 0;
		while (temp != 1 && temp != 2) {
			System.out.println("Enter a choose: 1 or 2");
			temp = input.nextInt();
		}
		return temp;
	}

	// to get customer information.
	public static Customer getCutomer() throws IOException {
		System.out.println("-------Input customer infomation -------");
		Information info = new Information();
		info = info.getInfomation();
		Customer customer = new Customer();
		customer = customer.getCustomer(info);

		return customer;
	}

	// to print card chosen and return int type.
	public static int chooseCard() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int temp = 0;
		while (temp != 1 && temp != 2) {
			System.out.println("---Choose card type: ");
			System.out.println("1. Credit Card");
			System.out.println("2. ATM Card");
			System.out.println("Enter a choosen 1 or 2: ");
			temp = input.nextInt();
		}
		return temp;
	}

	// to get card information.
	public static Card getCard() throws IOException, ParseException {
		System.out.println("-------Input card infomation-------");
		Information info = new Information();
		info = info.getInfomation();
		Card card = new Card();
		card = card.getCard(info);
		return card;
	}

}
