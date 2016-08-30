package task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Vo Van Minh
 * @version 1.0
 * @created 29-Aug-2016 9:22:36 AM
 */
public class Order {

	private Date orderDate;
	private boolean printOrder;
	private String status;
	public ArrayList<OrderDetail> listOrderDetail = new ArrayList<OrderDetail>();

	public Order() {

	}

	public Order(Date orderDate, boolean printOrder, String status) {
		super();
		this.orderDate = orderDate;
		this.printOrder = printOrder;
		this.status = status;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public boolean isPrintOrder() {
		return printOrder;
	}

	public void setPrintOrder(boolean printOrder) {
		this.printOrder = printOrder;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void finalize() throws Throwable {

	}

	/*
	 * Get a order. Input: a list order detail. Output: a Order.
	 */
	public Order getOrder(ArrayList<OrderDetail> listOrderDetail) throws IOException, ParseException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-----Input order information-----");

		System.out.println("Enter order date dd/mm/yyyy: ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date orderDay = sdf.parse(input.readLine());
		System.out.println(sdf.format(orderDay));
		System.out.println("Enter print order true/false: ");
		boolean printOrder = Boolean.parseBoolean(input.readLine());

		System.out.println("Enter status: ");
		String status = input.readLine();

		Order order = new Order(orderDay, printOrder, status);
		order.setListOrderDetail(listOrderDetail);
		return order;
	}

	// to calculate total money of a order.
	public double calSubTotal() {
		double result = 0;
		for (int i = 0; i < listOrderDetail.size(); i++) {
			result += listOrderDetail.get(i).calLineTotal();
		}
		return result;
	}

	// to calculate tax of a order.
	public double calTax() {
		if (printOrder)
			return 0.1;
		return 0;
	}

	// to calculate total money with tax.
	public double calTotalAmount() {
		return (calSubTotal() + calSubTotal() * calTax());
	}

	/*
	 * to add a order detail into list. Input: a order detail. Output: a list
	 * order detail.
	 */
	public void addOrderDetail(OrderDetail ord) {
		listOrderDetail.add(ord);
	}

	public ArrayList<OrderDetail> getListOrderDetail() {
		return listOrderDetail;
	}

	public void setListOrderDetail(ArrayList<OrderDetail> listOrderDetail) {
		this.listOrderDetail = listOrderDetail;
	}

	// to print Order information.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return orderDate + "\t" + printOrder + "\t" + status;
	}

	// to print list order detail information.
	public void printListODetail() {
		for (int i = 0; i < listOrderDetail.size(); i++) {
			System.out.println(listOrderDetail.get(i).toString());
		}
	}
}