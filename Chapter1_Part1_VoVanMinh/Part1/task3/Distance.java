package task3;
/* @Distance Class
 * @Author: Vo Van Minh
 * @Date: 19-08-2016
 * @Version: 1.0
 */
public class Distance {
	/*
	 * Calculating the distance between 2 points function. Input: 2 points.
	 * Output: return distance float type.
	 */
	public float calDistance(PointClass A, PointClass B) {
		float result = 0;
		result = (float) Math.sqrt((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y));
		return result;
	}
}
