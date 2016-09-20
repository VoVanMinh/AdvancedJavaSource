package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 19, 2016
 */
@SuppressWarnings("serial")
public class CD implements Serializable{
	int id;
	String name;
	String singer;
	int numberSongs;
	double price;

	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CD(int id, String name, String singer, int numberSongs, double price) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numberSongs = numberSongs;
		this.price = price;
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

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberSongs() {
		return numberSongs;
	}

	public void setNumberSongs(int numberSongs) {
		this.numberSongs = numberSongs;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @to get a cd from keyboard
	 * @return CD
	 * @throws IOException
	 */
	public static CD getCD() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-----Input CD-----");
		System.out.println("Enter name: ");
		String name = input.readLine();
		System.out.println("Enter singer: ");
		String singer = input.readLine();
		int numberSongs = 0;
		while (numberSongs < 1) {
			System.out.println("Enter number of songs >= 1: ");
			numberSongs = Integer.parseInt(input.readLine());
		}
		double price = 0;
		while (price <= 0) {
			System.out.println("Enter price > 0: ");
			price = Double.parseDouble(input.readLine());
		}
		CD cd = new CD(0, name, singer, numberSongs, price);
		return cd;
	}

	//to print a CD information
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + id + ", " + name + ", " + singer + ", " + numberSongs + ", " + price + "]";
	}
}
