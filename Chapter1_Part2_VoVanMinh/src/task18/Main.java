package task18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * @Main class to execute program
 * @Author: Vo Van Minh
 * @Date: 24-08-2016
 * @Version: 1.0
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("-----Input information------");
			System.out.println("---Enter shape: ");
			String shape = input.readLine();
			System.out.println("---Enter color: ");
			String color = input.readLine();
			
			System.out.println("---Enter name: ");
			String name = input.readLine();
			System.out.println("---Enter weight: ");
			float weight = input.read();
			
			GiftBox giftBox = new GiftBox(shape, color);
			GiftBox.Gift gift = giftBox.new Gift(name, weight);
			
			System.out.println("------ Gift information------");
			System.out.println(giftBox.toString());
			System.out.println(gift.toString());
			System.out.println("Total fee is " +gift.calFee());
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
