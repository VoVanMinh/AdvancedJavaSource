package test;

import static org.junit.Assert.*;
import org.junit.Test;
import source.Mark;

/**
 * Test for Mark class.
 * 
 * @author vovanminh
 * @version 1.0
 * @created 06-Sep-2016 6:40:13 PM
 */
public class MarkTest {

	// test for totalMark() method.
	@Test
	public void test() {
		Mark mark = new Mark();
		float[] quizMark = { 0, 2, 3, 5, 7, 11, 13, 17, 19, 23 };
		float[] practiceMark = { 1, 4, 6, 8, 9, 10, 12, 14, 15, 18 };
		float[] ex = { 0.3f, 2, 3, 4.4f, 5.5f, 7.4f, 8.8f, 11, 12.1f, 14.6f };
		float ac;

		for (int i = 0; i < ex.length; i++) {
			mark.setQuizMark(quizMark[i]);
			mark.setPracticeMark(practiceMark[i]);
			ac = mark.totalMark();
			assertEquals(ex[i], ac, 0);
		}

	}

}
