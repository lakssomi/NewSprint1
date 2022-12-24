package userstory;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class GradeGenerator {
	public Map<String, Integer> gradegenerator() {

		HashMap<String, Integer> hs = new HashMap<String, Integer>();

		hs.put("student101", 21);
		hs.put("student102", 44);
		hs.put("student103", 56);
		System.out.println("privious grades " + hs);

		return hs;

	}

	public Map<String, Integer> getMakeupGrades() {
		HashMap<String, Integer> hs1 = new HashMap<String, Integer>();
		hs1.put("student101", 35);
		hs1.put("student102", 9);
		hs1.put("student103", 66);
		System.out.println("makeup grades " + hs1);

		return hs1;

	}

	public Map<String, Integer> finalgrades() {

		Map<String, Integer> g1 = gradegenerator();
		Map<String, Integer> g2 = getMakeupGrades();

		for (Entry<String, Integer> entry : g1.entrySet()) {
			// get the key, from g1
			String en = entry.getKey();
			System.out.println("en" + en);
			// get the value from g1
			Integer val = entry.getValue();
			System.out.println("val" + val);
			// from that key get the value from g2

			Integer val2 = g2.get(en);
			// compare the values from g1 and g2 and pick the highest grade
			if (val < val2) {
				g1.replace(en, val2);

			}

		}
		System.out.println("g1" + g1);

		return g1;

	}

	@Test
	public void testcase1() {
		finalgrades();
		// gradegenerator();
		// getMakeupGrades();

	}

}
