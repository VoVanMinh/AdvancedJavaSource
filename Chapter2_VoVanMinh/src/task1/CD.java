package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CD implements Comparable<CD>{
	String id;
	String name;
	String singer;
	int numOfSing;
	float price;

	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CD(String id, String name, String singer, int numOfSing, float price) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numOfSing = numOfSing;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumOfSing() {
		return numOfSing;
	}

	public void setNumOfSing(int numOfSing) {
		this.numOfSing = numOfSing;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + id + ", " + name + ", " + singer + ", " + numOfSing + ", " + price + " ]";
	}

	static CD getCD() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id: ");
		String id = input.readLine();
		System.out.println("Enter name: ");
		String name = input.readLine();
		System.out.println("Enter singer: ");
		String singer = input.readLine();
		int numOfSing = 0;
		while (numOfSing < 1) {
			System.out.println("Enter number of sing >=1: ");
			numOfSing = Integer.parseInt(input.readLine());
		}
		System.out.println("Enter price: ");
		float price = Float.parseFloat(input.readLine());

		CD cd = new CD(id, name, singer, numOfSing, price);
		return cd;

	}

	@Override
	public int compareTo(CD cd) {
		// TODO Auto-generated method stub
		return (this.name).compareTo(cd.name);
	}
}
