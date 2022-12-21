package userstory;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfEvenandSumOfOdd {
	public List sumOfEvenandOdd(int num) {
		ArrayList<Integer> al = new ArrayList();

		int oddsum = 0;
		int evensum = 0;
		int remainder = 0;
		while (num > 0) {
			remainder = num % 10;
			System.out.println(" remainder " + remainder);
			if (remainder % 2 == 0) {
				evensum = evensum + remainder;

			} else {
				oddsum = oddsum + remainder;

			}
			num = num / 10;
			System.out.println(" remainder " + remainder);
		}

		System.out.println("Summ of even " + evensum);
		System.out.println("Summ of odd " + oddsum);

		al.add(evensum);
		al.add(oddsum);

		return al;

	}

	@Test
	public void testcase1() {
		int num = 2563;
		List ar1 = sumOfEvenandOdd(num);
		System.out.println(ar1);
		System.out.println(ar1.get(0));

		Assert.assertEquals(ar1.get(0), 8);
		Assert.assertEquals(ar1.get(1), 8);

	}

	@Test
	public void testcase2() {
		int num = 1234;
		List ar1 = sumOfEvenandOdd(num);
		System.out.println(ar1);
		System.out.println(ar1.get(0));

		Assert.assertEquals(ar1.get(0), 6);
		Assert.assertEquals(ar1.get(1), 4);

	}

	@Test
	public void testcase3() {
		int num = 552245;
		List ar1 = sumOfEvenandOdd(num);
		System.out.println(ar1);
		System.out.println(ar1.get(0));

		Assert.assertEquals(ar1.get(0), 8);
		Assert.assertEquals(ar1.get(1), 15);

	}
}
