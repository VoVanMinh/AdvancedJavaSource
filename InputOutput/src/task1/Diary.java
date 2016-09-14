package task1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 14, 2016
 * @Demo how to read/write a file.
 */
public class Diary {
	public static void main(String[] args) {
		int choose = -1;
		String path = "src/task1/daily.txt";
		try {
			while (choose != 0) {
				choose = menuMain();
				switch (choose) {
				case 1:
					// read file and print file.
					readFile(path);
					break;
				case 2:
					// add diary to list.
					appendDiary(path);
					break;
				default:
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @to append to file.
	 * @param path
	 * @throws IOException 
	 */
	private static void appendDiary(String path) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter content of diary: ");
		String content = input.readLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dateWrite = sdf.format(new Date());
		
		DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path, true)));
		output.writeUTF(dateWrite);
		output.writeUTF(content);
		output.close();
		
		System.out.println("---Added diary.");
	}

	/**
	 * @to read file from path and print content
	 * @param path
	 * @return
	 * @throws IOException
	 */
	private static void readFile(String path) throws IOException {
		DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(path)));
		String dateWrite = " ";
		String content = " ";
		String diary = "";
		
		while (input.available() > 0) {
			dateWrite = input.readUTF();
			content = input.readUTF();

			diary += dateWrite + "\n" + content +"\n\n";
		}
		input.close();
		System.out.println("-----Diary-----");
		System.out.println(diary);
	}

	/**
	 * @to print main menu.
	 * @return a chosen int type from keyboard.
	 */
	private static int menuMain() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int choose = -1;
		while (choose < 0 || choose > 2) {
			System.out.println("-----Diary Management-----");
			System.out.println("0. Quit");
			System.out.println("1. Read diary");
			System.out.println("2. Write diary (append)");
			System.out.println("Enter a chosen: ");
			choose = input.nextInt();
		}
		return choose;
	}

}
