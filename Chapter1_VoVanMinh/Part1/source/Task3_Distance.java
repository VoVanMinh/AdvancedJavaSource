package source;
/* Distance Class
 * Author: Vo Van Minh
 * Date 19-08-2016
 * Version 1
 */
public class Task3_Distance {
	/*
	 * calculating the distance between 2 points function. Input: 2 points
	 * Output: return distance float type.
	 */
	public float calDistance(Task3_Point A, Task3_Point B) {
		float result = 0;
		result = (float) Math.sqrt((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y));
		return result;
	}
}
