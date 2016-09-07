package source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vovanminh
 * @version 1.0
 * @created 06-Sep-2016 6:40:13 PM
 */
public class Session {

	private float assignmentMark;
	private float positiveMark;
	private int plusMark;

	public Session() {

	}

	public Session(float assignmentMark, float positiveMark, int plusMark) {
		super();
		this.assignmentMark = assignmentMark;
		this.positiveMark = positiveMark;
		this.plusMark = plusMark;
	}

	public float getAssignmentMark() {
		return assignmentMark;
	}

	public void setAssignmentMark(float assignmentMark) {
		this.assignmentMark = assignmentMark;
	}

	public float getPositiveMark() {
		return positiveMark;
	}

	public void setPositiveMark(float positiveMark) {
		this.positiveMark = positiveMark;
	}

	public int getPlusMark() {
		return plusMark;
	}

	public void setPlusMark(int plusMark) {
		this.plusMark = plusMark;
	}

	public float sumMark() {
		float temp = (float) (plusMark * 0.3 + positiveMark * 0.1 + assignmentMark * 0.6);
		return temp;
	}
	//to get a session from keyboard.	
	public static Session getSession() throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-------Input Session Information-----");
		System.out.println("Enter plus mark: ");
		int plusMark = Integer.parseInt(input.readLine());
		System.out.println("Enter positive mark: ");
		float positiveMark = Float.parseFloat(input.readLine());
		System.out.println("Enter assignment mark: ");
		float assignmentMark = Float.parseFloat(input.readLine());
		Session se = new Session(assignmentMark, positiveMark, plusMark);
		return se;
	}
	//to print a session.
	public void printSession() {
		System.out.println("-----------");
		System.out.println("Plus mark: " + plusMark);
		System.out.println("Positive mark: " + positiveMark);
		System.out.println("Assignment mark: " + assignmentMark);
	}
}