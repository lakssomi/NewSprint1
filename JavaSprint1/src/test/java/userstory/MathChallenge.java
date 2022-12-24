package userstory;

import org.testng.annotations.Test;

public class MathChallenge {
	public int mathChallenge(String str) {

		char x = 0;
		int equal = str.indexOf("=");
		String left = str.substring(0, equal);
		String right = str.substring(equal + 1, str.length());
		System.out.println("equal " + equal);
		System.out.println("left " + left);
		System.out.println("right " + right);
		String operators = "+-*/";
		String revoperators = "-+/*";

		for (int i = 0; i < 4; i++) {
			if (left.indexOf(operators.charAt(i)) > 0) {
				right = right + revoperators.charAt(i)
						+ left.substring(left.indexOf(operators.charAt(i)) + 1, left.length());
				System.out.println("rightside " + right);

				left = left.substring(0, left.indexOf(operators.charAt(i)));
				System.out.println("leftside " + left);
				char[] digit = right.toCharArray();
				System.out.println(digit);

			}

		}

		return x;

	}

	private String operators(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void testcase1() {

		int m = mathChallenge("3x+5=11");
		System.out.println(m);
	}

}
