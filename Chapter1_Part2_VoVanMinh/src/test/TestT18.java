package test;

import static org.junit.Assert.*;

import org.junit.Test;
import task18.GiftBox;
/*
 * @Test for package task 18, class GiftBox.
 * @Author: Vo Van Minh
 * @Date: 24-08-2016
 * @Version: 1.0
 */
public class TestT18 {

	//test for calculate total fee method 
	@Test
	public void test() {
		GiftBox giftBox = new GiftBox();
		float[] weight = {1,2,3,4,5,6,7,8,9,10};
		float[] ex = {10200,10400,10600,10800,11000,11200,11400,11600,11800,12000};
		float ac;
		
		for (int j = 0; j < weight.length; j++) {
			GiftBox.Gift gift = giftBox.new Gift(weight[j]);
			ac = gift.calFee();
			
			assertEquals(ex[j], ac, 0);
		}
		
		
	}

}
