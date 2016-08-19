package source;
/* Salary class
 * Author: Vo Van Minh
 * Date 19-08-2016
 * Version 1
 */
public class Task6_Salary {
	
	final float BASEDSALARY = 1260000;
	final int UNIT = 1000000;
	final float BASE1 = 9000000;
	final float BASE2 = 3600000;
	final int[] REVENUE = {0, 5, 10, 18, 32, 52, 80 };
	final float[] TAX = { 0.05f, 0.10f, 0.15f, 0.20f, 0.25f, 0.30f, 0.35f };
	
	/* Calculate revenue of a employee.
	 * Input: a employee.
	 * Output: return float type.
	 */
	public float calRevenue(Task6_Employee emp) {
		if (emp.getFactorSalary() < 0)
			return 0;
		float result = emp.getFactorSalary() * BASEDSALARY + emp.getAllowance();
		return result;
	}

	/* Calculate income taxes of a employee.
	 * Input: a employee.
	 * Output: return float type.
	 */
	public float calRevenueTax(Task6_Employee emp) {
		float result = 0;
		if (emp.getNumberPeople() < 0)
			emp.setNumberPeople(0);
		float revenue = calRevenue(emp);
		if (revenue < 0)
			revenue = 0;
		result = revenue - BASE1 - emp.getNumberPeople() * BASE2;
		return result;
	}
	
	/* Calculate taxes under the tax bracket.
	 * Input: a employee.
	 * Output: return array float type.
	 */
	public float[] arrTaxMoney(){
		float[] result = new float[REVENUE.length - 1];
		for (int i = 0; i < result.length; i++) {
			result[i] = ((REVENUE[i+1] - REVENUE[i]) * TAX[i]) * UNIT;
		}
		return result;
	}
	
	/* Calculate personal income tax.
	 * Input: a employee.
	 * Output: return array float type.
	 */
	public float calTax(Task6_Employee emp){
		float result = calRevenueTax(emp);
		float arr[] = arrTaxMoney();
		if(result > REVENUE[6]*UNIT){
			result = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] 
					+ (result - REVENUE[6]*UNIT) * TAX[6];
		}else if(result >= REVENUE[5]*UNIT){
			result = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + (result - REVENUE[5]*UNIT) * TAX[5];
		}else if(result >= REVENUE[4]*UNIT){
			result = arr[0] + arr[1] + arr[2] + arr[3] + (result - REVENUE[4]*UNIT) * TAX[4];
		}else if(result >= REVENUE[3]*UNIT){
			result = arr[0] + arr[1] + arr[2] + (result - REVENUE[3]*UNIT) * TAX[3];
		}else if(result >= REVENUE[2]*UNIT){
			result = arr[0] + arr[1] + (result - REVENUE[2]*UNIT) * TAX[2];
		}else if(result >= REVENUE[1]*UNIT){
			result = arr[0] + (result - REVENUE[1]*UNIT) * TAX[1];
		}else if(result > REVENUE[0]){
			result *= TAX[0];
		}else {
			result = 0;
		}
		return result;
	}

	/* Calculate the employee's salary after taxes.
	 * Input: a employee.
	 * Output: return float type.
	 */
	public float calSalary(Task6_Employee emp) {
		float result = calRevenue(emp) - calTax(emp);
		return result;
	}
	
	public float getBASEDSALARY() {
		return BASEDSALARY;
	}

	public int getUNIT() {
		return UNIT;
	}

	public float getBASE1() {
		return BASE1;
	}

	public float getBASE2() {
		return BASE2;
	}

	public int[] getREVENUE() {
		return REVENUE;
	}

	public float[] getTAX() {
		return TAX;
	}
}
