package task15;
/* Author: Vo Van Minh
 * Date 23-08-2016
 * Version 1
 */
import java.util.Scanner;

public class NonStringedInstrument extends Instrument{
	String using;

	public NonStringedInstrument() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NonStringedInstrument(String name, String manufacture) {
		super(name, manufacture);
		// TODO Auto-generated constructor stub
	}

	public NonStringedInstrument(String using) {
		super();
		this.using = using;
	}

	public String getUsing() {
		return using;
	}

	public void setUsing(String using) {
		this.using = using;
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("----Instrument Information-----");
		System.out.println(super.toString() + using);
	}
	
	/*
	 * get a NonStringedInstrument
	 */
	NonStringedInstrument getNSI(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name: ");
		String n = input.nextLine();
		System.out.println("Enter manufacture: ");
		String manufac = input.nextLine();
		System.out.println("Input how to use: ");
		String using = input.nextLine();
		NonStringedInstrument nsi = new NonStringedInstrument(n, manufac);
		nsi.setUsing(using);
		return nsi;
	}
}
