package userstory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PhoneBillgenerator {
	public double phoneBill(int planfee, int overagemin) {

		double phoneBill = planfee + overagemin * 0.25;
		System.out.println("phoneBill " + phoneBill);

		return phoneBill;

	}

	public double tax(double phoneBill) {

		double subtotal = phoneBill * 0.15;
		// double finalBill = total + phoneBill;
		System.out.println("subtotal " + subtotal);

		return subtotal;

	}

	public double finalBill(int planfee, int overagemin) {

		double bill = phoneBill(planfee, overagemin);
		double taxamount = tax(bill);
		double finalphoneBill = bill + taxamount;

		return finalphoneBill;

	}

	@Test
	public void testcase1() {

		double finalphonebill = finalBill(100, 25);

		System.out.println("finalBill " + finalphonebill);
		Assert.assertEquals(finalphonebill, 122.1875);

	}

	@Test
	public void testcase2() {

		double finalphonebill = finalBill(100, -25);

		System.out.println("finalBill " + finalphonebill);
		Assert.assertEquals(finalphonebill, 107.8125);

	}

}
