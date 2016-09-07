package source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author vovanminh
 * @version 1.0
 * @created 06-Sep-2016 6:40:13 PM
 */
public class Person {

	private String name;
	private String birthDay;
	private String phone;
	private String email;

	public Person() {

	}

	public Person(String name, String birthDay, String phone, String email) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * Get a Person. Input: user input from keyboard. Output: a Person.
	 */
	public static Person getPerson() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-------Input Person Information-----");
		System.out.print("---Name: ");
		String name = input.readLine();
		String bir = " ";
		while (!checkDate(bir)) {
			System.out.print("\n---Birthday dd/MM/yyyy: ");
			bir = input.readLine();
		}
		System.out.print("\n---Email: ");
		String email = input.readLine();
		String phone = " ";
		while (!checkPhone(phone)) {
			System.out.print("\n---Phone (10 or 11 number): ");
			phone = input.readLine();
		}

		return new Person(name, bir, phone, email);
	}

	/*
	 * to check String. Input: a String string. Output: true/false.
	 */
	public static boolean checkDate(String str) {
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
	static boolean checkPhone(String phone) {
		String re = "^(0[19])([0-9]{8,9})$";
		Pattern p = Pattern.compile(re);
		Matcher m = p.matcher(phone);
		if (m.matches())
			return true;
		return false;
	}

	public void printPerson() {
		System.out.println("Name: " + name);
		System.out.println("Birthday: " + birthDay);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phone);
	}

}