package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import stream.EmployeeManager;
import stream.Employee;

/**
 * @test for package stream, class EmployeeManager
 * @author vovanminh
 * @version 1.0
 * @created Sep 19, 2016
 */
public class StreamTest {

	// test for calAverageAge() method
	@Test
	public void test1() {
		EmployeeManager empManager = new EmployeeManager();
		empManager.addEmployeeToList();

		List<Employee> list = new ArrayList<>(empManager.list);
		empManager.list.clear();

		int[] ex = { 22, 26, 24, 24, 27, 27, 28, 29, 29, 29, 29, 31, 32, 32, 32 };
		int ac = 0;

		for (int i = 0; i < list.size(); i++) {
			empManager.list.add(list.get(i));

			ac = empManager.calAverageAge();
			assertEquals(ex[i], ac, 0);
		}

	}

	// test for searchName(String) method
	@Test
	public void test2() {
		EmployeeManager empManager = new EmployeeManager();
		empManager.addEmployeeToList();

		String[] name = { "Minh", "Nguyen", "Bui", "Tan", "Van", "Qu", "Th", "Ti", "WM", "STT" };
		int[] ex = { 3,3,1,2,1,3,3,2,0,0 };
		int ac = 0;

		for (int i = 0; i < name.length; i++) {
			ac = empManager.searchName(name[i]);
			assertEquals(ex[i], ac, 0);
		}

	}
}
