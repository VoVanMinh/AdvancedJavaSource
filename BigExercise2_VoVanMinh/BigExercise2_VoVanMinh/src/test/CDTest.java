package test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import jdbc.CD;

import jdbc.CDController;;

/**
 * @test for package jdbc, class CDController
 * @author vovanminh
 * @version 1.0
 * @created Sep 20, 2016
 */
public class CDTest {

	public boolean compare2List(List<CD> list1, List<CD> list2) {
		if (list1.size() != list2.size())
			return false;
		return list1.toString().contentEquals(list2.toString());
	}

	// test for searchCDByName() method
	@Test
	public void test() {
		List<CD> list = new ArrayList<>();
		list.add(new CD(5, "cd5", "singer5", 6, 600));
		
		CDController cdC = new CDController();
		try {
			cdC.searchCDByName("d5");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		boolean ac = compare2List(list, cdC.list);
		assertTrue(ac);
	}

	// test for searchCDByName() method
		@Test
		public void test1() {
			List<CD> list = new ArrayList<>();
			list.add(new CD(6, "cd5", "singer5", 6, 600));
			
			CDController cdC = new CDController();
			try {
				cdC.searchCDByName("d5");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			boolean ac = compare2List(list, cdC.list);
			assertFalse(ac);
		}
}
