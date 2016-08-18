package Chapter1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Part1_Test {

	Part1_LinearEquation linearEquation = new Part1_LinearEquation();

	@Test
	public void test() {

		float a[] = { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
		float b[] = { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 };
		float ex[] = { Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, 
						Float.NaN, Float.NaN, -1, -1, -1, -1, -1, -1 };
		float ac;

		for (int i = 0; i < 10; i++) {
			linearEquation.setA(a[i]);
			linearEquation.setB(b[i]);
			ac = linearEquation.findRoot();
			
			assertEquals(ex[i], ac, 0);
		}
	}

}
