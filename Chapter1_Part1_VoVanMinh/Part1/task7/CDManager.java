package task7;
/* CD Manager class
 * Author: Vo Van Minh
 * Date 19-08-2016
 * Version 1
 */
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CDManager {

	List<CD> arrCD = new ArrayList<CD>();

	/* Add a cd into List.
	 * Input: a cd object.
	 */
	public void addCD(CD cd) {
		arrCD.add(cd);
	}

	/*
	 * Print a list CD object.
	 */
	public void printArrCD() {
		System.out.println("------------------------------------------------------");
		System.out.println("id \tname \tsinger \tnumOfSong \t\tprice");
		System.out.println("------------------------------------------------------");
		for (int i = 0; i < arrCD.size(); i++) {
			System.out.println(arrCD.get(i).toString());
		}
		System.out.println("------------------------------------------------------");
	}

	/*
	 * Calculate total money of all CD object in List.
	 */
	public float calTotalPrice() {
		float result = 0;
		for (int i = 0; i < arrCD.size(); i++) {
			result += arrCD.get(i).getPrice();
		}
		return result;
	}

	/*
	 * Get a CD object from user input.
	 * Output: return a CD object.
	 */
	CD getCD() throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("-----------------CD Manager---------------");

		System.out.println("Enter id: ");
		String id = input.readLine();

		System.out.println("Enter name: ");
		String name = input.readLine();

		System.out.println("Enter singer: ");
		String singer = input.readLine();

		System.out.println("Enter number of song: ");
		int numOfSong = Integer.parseInt(input.readLine());

		System.out.println("Enter price: ");
		float price = Float.parseFloat(input.readLine());

		CD cd = new CD(id, name, singer, numOfSong, price);
		return cd;
	}
}
