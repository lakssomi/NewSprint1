package userstory;

import java.util.Arrays;

import org.testng.annotations.Test;

public class AnagramsSprint1 {
	public boolean anagrams(String str1, String str2) {

		// str1.toLowerCase();
		// str2.toLowerCase();
		if (str1.length() != str2.length()) {
			return false;

		} else {
			// System.out.println("enter");
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			System.out.println(str1);
			System.out.println(str2);

			char[] a1 = str1.toCharArray();
			char[] a2 = str2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);

			return Arrays.equals(a1, a2);

		}

	}

	@Test
	public void testcase1() {
		String str1 = "CBAEBABACD";
		String str2 = "ABC";
		boolean b = anagrams(str1, str2);
		System.out.println(b);

	}

	@Test
	public void testcase2() {
		String str1 = "SILENT";
		String str2 = "LISTEN";
		boolean b = anagrams(str1, str2);
		System.out.println("given strings are anagrams " + b);

	}

	@Test
	public void testcase3() {
		String str1 = "Lives";
		String str2 = "slives";
		boolean b = anagrams(str1, str2);
		System.out.println(b);

	}

	@Test
	public void testcase4() {
		String str1 = "keep";
		String str2 = "Peek";
		boolean b = anagrams(str1, str2);

		System.out.println(b);

	}

}
