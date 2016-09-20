package txt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import jdbc.CD;
import jdbc.CDController;

/**
 * @to read/write file and print info CD
 * @author vovanminh
 * @version 1.0
 * @created Sep 19, 2016
 */
public class Main {
	
	public static void main(String[] args) {

		String path = "src/txt/cd.txt";
		CDController cdController = new CDController();

		try {
			// to get all CD from database to list
			cdController.getCDList();
			
			//to write all CD in list to file
			writeListtoFile(cdController.list, path);
			
			//to read file and add CD to list
			readFiletoList(cdController.list, path);
			
			//print list
			cdController.printList();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * @param list 
	 * @to write file from list
	 * @param list, path
	 * @throws IOException
	 */
	public static void writeListtoFile(List<CD> list, String path) throws IOException {
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(path));
		output.writeInt(list.size());

		for (CD cd : list) {
			output.writeObject(cd);
			output.flush();
		}
		output.reset();
		output.close();
	}

	/**
	 * @to read file from path and add to list
	 * @param list, path
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void readFiletoList(List<CD> list, String path) throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream(path);
		if (file.available() != 0) {
			ObjectInputStream input = new ObjectInputStream(file);
			list.clear();
			
			int size = input.readInt();
			for (int i = 0; i < size; i++) {
				list.add((CD) input.readObject());
			}
			input.close();
		}
		
	}
}
