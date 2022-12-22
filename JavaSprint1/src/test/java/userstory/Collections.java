package userstory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class Collections {

	public void printvalues() {

		Map<String, List<String>> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		map.put("fruit", list);
		map.get("fruit").add("Apple");
		map.get("fruit").add("Mango");
		System.out.println(map);

	}

	@Test
	public void testcase() {
		printvalues();

	}
}
