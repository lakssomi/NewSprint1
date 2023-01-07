package userstory;

import org.testng.annotations.Test;

public class ArrangeArray {
	public double powerarray(int[] arr) {
		double pow = Math.pow(arr[1], arr[2]);

		double result = Math.pow(arr[0], pow);

		return result;

	}

	public int[] arrangearr(int[] arr) {
		double maxnum;
		double num;
		int[] maxarray = null;

		int[] temparray;

		num = powerarray(arr);

		return maxarray;

	}

	@Test
	public void testcase1() {
		int[] arr1 = { 2, 3, 1 };
		double result = powerarray(arr1);
		System.out.println(result);

	}

}
