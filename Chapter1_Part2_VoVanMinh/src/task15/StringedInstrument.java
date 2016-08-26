package task15;
import java.util.Scanner;
/* @StringedInstrument class
 * @Author: Vo Van Minh
 * @Date: 23-08-2016
 * @Version: 1.0
 */
public class StringedInstrument extends Instrument{
	int numberStr;

	public StringedInstrument() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StringedInstrument(String name, String manufacture) {
		super(name, manufacture);
		// TODO Auto-generated constructor stub
	}

	public StringedInstrument(int numberStr) {
		super();
		this.numberStr = numberStr;
	}

	public int getNumberStr() {
		return numberStr;
	}

	public void setNumberStr(int numberStr) {
		this.numberStr = numberStr;
	}

	//to print information of StringedInstrument.
	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("----Instrument Information-----");
		System.out.println(super.toString() + numberStr);
	}

	//to get a StringedInstrument.
	StringedInstrument getSI(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name: ");
		String n = input.nextLine();
		System.out.println("Enter manufacture: ");
		String manufac = input.nextLine();
		System.out.println("Input stringed: ");
		int nums = input.nextInt();
		StringedInstrument si = new StringedInstrument(n, manufac);
		si.setNumberStr(nums);
		return si;
	}
	
}
