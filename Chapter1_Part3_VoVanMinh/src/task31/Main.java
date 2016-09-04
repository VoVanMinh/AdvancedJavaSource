package task31;

import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:14:59 PM
 */
public class Main {

public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	try {
		int type = 0; 
		while(type < 1 || type > 3){
			System.out.print("Enter frock type: \n\t1. Traditional\n\t2. Stylize\n\t3. Modern\nSelect: ");
			type = input.nextInt();
		}
		FactoryPattern fp = new FactoryPattern();
		Factory factory = fp.getFactory(type);
		factory.chooseFactory().sew();
	} catch (Exception e) {
		System.out.println(e.getMessage());
}
}

}