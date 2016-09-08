package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 7, 2016
 */
public class StudentManager {
	TreeMap<String, Student> treeMap = new TreeMap<>();
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	// to add student with id into list.
	public void addAStudent() throws IOException {
		System.out.println("Enter id: ");
		String id = input.readLine();
		if (treeMap.containsKey(id))
			System.out.println("ID already exist!");
		else {
			Student st = Student.getStudent();
			treeMap.put(id, st);
			System.out.println("---Added!");
		}
	}

	// to print student list..
	public void printStudentList() {
		for (String key : treeMap.keySet()) {
			System.out.println(key + ": " +treeMap.get(key));
		}
		
	}

	/*
	 * to search a student by id. Input: id, a Student. Output: print result.
	 */
	public void search() throws IOException {
		System.out.println("Enter id you want to search: ");
		String id = input.readLine();
		if (treeMap.containsKey(id)) {
			System.out.println("\t" + id + " : " + treeMap.get(id));
		} else
			System.out.println("---Sorry, ID not exsit in Dictonary!");
	}

	/*
	 * to remove a student by id. Input: id, a Student. Output: print result.
	 */
	public void remove() throws IOException {
		System.out.println("Enter id you want to remove: ");
		String id = input.readLine();
		if (treeMap.containsKey(id)) {
			treeMap.remove(id);
			System.out.println("---Removed!");
		} else
			System.out.println("---Sorry, Word not exsit in Dictonary!");
	}

	// to set data example.
	public void setDataDefault() {
		Student st1 = new Student("Nguyen Van A", 21, "Viet Nam");
		Student st2 = new Student("Nguyen Van B", 22, "USA");
		Student st3 = new Student("Nguyen Van B", 23, "Brazil");

		treeMap.put("001", st1);
		treeMap.put("002", st2);
		treeMap.put("003", st3);
	}
}
