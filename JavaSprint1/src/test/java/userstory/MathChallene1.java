package userstory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathChallene1 {
	public static int mathChall(String s) {
		int result = 0;
		int signindex = 0;
		int equalindex = 0;

		for (int i = 0; i < s.length(); i++) {
			int index = s.indexOf('x');

			if (s.charAt(index - 1) == '=') {

				if (s.contains("+")) {
					signindex = s.indexOf("+");
					int s1 = Integer.parseInt(s.substring(0, signindex));
					int s2 = Integer.parseInt(s.substring(signindex + 1, index - 1));
					result = s1 + s2;
				}
				if (s.contains("-")) {
					signindex = s.indexOf("-");
					int s1 = Integer.parseInt(s.substring(0, signindex));
					int s2 = Integer.parseInt(s.substring(signindex + 1, index - 1));
					result = s1 - s2;
				}
				if (s.contains("*")) {
					signindex = s.indexOf("*");
					int s1 = Integer.parseInt(s.substring(0, signindex));
					int s2 = Integer.parseInt(s.substring(signindex + 1, index - 1));
					result = s1 * s2;
				}
				if (s.contains("/")) {
					signindex = s.indexOf("/");
					int s1 = Integer.parseInt(s.substring(0, signindex));
					int s2 = Integer.parseInt(s.substring(signindex + 1, index - 1));
					result = s1 / s2;
				}
			} else {
				if (s.contains("+")) {
					signindex = s.indexOf("+");
					equalindex = s.indexOf("=");
					if (index > signindex) {
						int coeeff = Integer.parseInt(s.substring(signindex + 1, index));
						int s1 = Integer.parseInt(s.substring(0, signindex));
						int s2 = Integer.parseInt(s.substring(equalindex + 1));
						int tempresult = s2 - s1;
						result = tempresult / coeeff;

					} else {
						int coeeff = Integer.parseInt(s.substring(0, index));
						int s1 = Integer.parseInt(s.substring(signindex + 1, equalindex));
						int s2 = Integer.parseInt(s.substring(equalindex + 1));
						int tempresult = s2 - s1;
						result = tempresult / coeeff;
					}
				}
				if (s.contains("-")) {
					signindex = s.indexOf("-");
					equalindex = s.indexOf("=");
					if (index > signindex) {
						int coeeff = Integer.parseInt(s.substring(signindex + 1, index));
						int s1 = Integer.parseInt(s.substring(0, signindex));
						int s2 = Integer.parseInt(s.substring(equalindex + 1));
						int tempresult = s1 - s2;
						result = tempresult / coeeff;

					} else {
						int coeeff = Integer.parseInt(s.substring(0, index));
						int s1 = Integer.parseInt(s.substring(signindex + 1, equalindex));
						int s2 = Integer.parseInt(s.substring(equalindex + 1));
						int tempresult = s2 + s1;
						result = tempresult / coeeff;
					}
				}
				if (s.contains("*")) {
					signindex = s.indexOf("*");
					equalindex = s.indexOf("=");
					if (index > signindex) {
						int coeeff = Integer.parseInt(s.substring(signindex + 1, index));
						int s1 = Integer.parseInt(s.substring(0, signindex));
						int s2 = Integer.parseInt(s.substring(equalindex + 1));
						int tempresult = s2 / s1;
						result = tempresult / coeeff;

					} else {
						int coeeff = Integer.parseInt(s.substring(0, index));
						int s1 = Integer.parseInt(s.substring(signindex + 1, equalindex));
						int s2 = Integer.parseInt(s.substring(equalindex + 1));
						int tempresult = s2 / s1;
						result = tempresult / coeeff;
					}
				}
				if (s.contains("/")) {
					signindex = s.indexOf("/");
					equalindex = s.indexOf("=");
					if (index > signindex) {
						int coeeff = Integer.parseInt(s.substring(signindex + 1, index));
						int s1 = Integer.parseInt(s.substring(0, signindex));
						int s2 = Integer.parseInt(s.substring(equalindex + 1));
						int tempresult = s1 / s2;
						result = tempresult / coeeff;

					} else {
						int coeeff = Integer.parseInt(s.substring(0, index));
						int s1 = Integer.parseInt(s.substring(signindex + 1, equalindex));
						int s2 = Integer.parseInt(s.substring(equalindex + 1));
						int tempresult = s1 * s2;
						result = tempresult / coeeff;
					}
				}

			}
		}

		System.out.println(result);
		return result;
	}

	@Test
	public void run1() {
		String s1 = "59-2x=9";
		int x = mathChall(s1);
		Assert.assertEquals(25, x);
	}

	@Test
	public void run2() {
		String s1 = "3x+13=46";
		int x = mathChall(s1);
		Assert.assertEquals(11, x);
	}

	@Test
	public void run3() {
		String s1 = "3x*2=36";
		int x = mathChall(s1);
		Assert.assertEquals(6, x);
	}

	@Test
	public void run4() {
		String s1 = "7-3=x";
		int x = mathChall(s1);
		Assert.assertEquals(4, x);
	}

	@Test
	public void run5() {
		String s1 = "9x/3=9";
		int x = mathChall(s1);
		Assert.assertEquals(3, x);
	}

}
