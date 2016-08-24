package task10;
import java.util.Scanner;
/* @Human class
 * @Author: Vo Van Minh
 * @Date: 22-08-2016
 * @Version: 1.0
 */

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human {
	String name;
	String birthday;
	String address;
	String phone;

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Human(String name, String birthday, String address, String phone) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.birthday = birthday;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// to print a human.
	void printHuman() {
		System.out.println("---Name: " + this.name);
		System.out.println("---Birthday: " + this.birthday);
		System.out.println("---Address: " + this.address);
		System.out.println("---Phone: " + this.phone);
	}

	/*
	 * Get a human. Input: user input from keyboard. Output: a human.
	 */
	Human getHuman() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("-------Human Information-----");
		System.out.print("---Name: ");
		String name = input.nextLine();
		String bir = " ";
		while (!checkDate(bir)) {
			System.out.print("\n---Birthday: ");
			bir = input.nextLine();
		}
		System.out.print("\n---Address: ");
		String address = input.nextLine();
		String phone = " ";
		while (!checkPhone(phone)) {
			System.out.print("\n---Phone: ");
			phone = input.nextLine();
		}

		Human h = new Human(name, bir, address, phone);
		return h;
	}

	/*
	 * to check date. Input: a date string. Output: true/false.
	 */
	public boolean checkDate(String str) {
		String re = "^(0[1-9]|[1-9]|1[0-9]|2[0-9]|3[0-1])/(0[1-9]|[1-9]|1[0-2])/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])$";
		Pattern p = Pattern.compile(re);
		Matcher m = p.matcher(str);
		if (!m.matches())
			return false;
		else {
			StringTokenizer stk = new StringTokenizer(str, "/");
			int ng = Integer.parseInt(stk.nextToken());
			int th = Integer.parseInt(stk.nextToken());
			int nam = Integer.parseInt(stk.nextToken());

			if (th == 4 || th == 6 || th == 9 || th == 11) {
				if (ng == 31)
					return false;
			}
			if (th == 2) {
				if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
					if (ng > 29)
						return false;
				} else {
					if (ng > 28)
						return false;
				}
			}
			return true;
		}
	}

	/*
	 * to check phone. Input: a phone. Output: true/false
	 */
	boolean checkPhone(String phone) {
		String re = "^(0[19])([0-9]{8,9})$";
		Pattern p = Pattern.compile(re);
		Matcher m = p.matcher(phone);
		if (m.matches())
			return true;
		return false;
	}
}
