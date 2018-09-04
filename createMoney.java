public class createMoney {
	public static void main(String[] args) {

		createMoney m = new createMoney(12, 33);
		// test prettyPrint
		System.out.println(m.prettyPrint());
		// test isEqual
		int[] a = { 2, 3 };
		System.out.println(isEqual(a, a));
		// test payWith20
		int[] d = payWith20(a);
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}

		// test adder function
		int[] m1 = { 10, 59 };
		int[] m2 = { 14, 61 };
		createMoney.adder(m1, m2);
		System.out.println(m1[0] + ":" + m1[1]);

	} // end main

	public createMoney(int dollar, int cents) {
		money[0] = dollar;
		money[1] = cents;
		while (money[1] > 99) {
			money[1] = money[1] - 100;
			money[0]++;
		}
	} // end createMoney

	// attributes
	int[] money = new int[2];

	// Accessor Methods
	public int dollars() {
		return money[0];
	} // end dollars

	public int cents(int[] money) {
		return money[1] * 100;
	} // end cents

	public String prettyPrint() {
		String returnVal = "$" + money[0] + "." + money[1];
		return returnVal;
	} // end prettyPrint

	public String moneyToText() {
		String returnVal = "";
		return returnVal;
	}

	// checking functions
	public static boolean isGreaterThan(int[] m1, int[] m2) {
		if (m1[0] > m2[0]) {
			return true;
		} else {
			return false;
		}
	} // end isGreaterThan

	public static boolean isEqual(int[] m1, int[] m2) {
		if (m1[0] == m2[0] && m2[1] == m2[1]) {
			return true;
		} else {
			return false;
		}
	} // end isEqual

	public static void adder(int[] m1, int[] m2) {
		m1[0] = m1[0] + m2[0];
		m1[1] = m1[1] + m2[1];
		if (m1[1] > 99) {
			m1[1] = m1[1] - 100;
			m1[0]++;
		}
	} // end adder

	public static int[] add(int[] m1, int[] m2) {
		int[] returnVal = new int[2];
		returnVal[0] = m1[0] + m2[0];
		returnVal[1] = m1[1] + m2[1];
		if (returnVal[1] > 99) {
			returnVal[1] = returnVal[1] - 100;
			returnVal[0]++;
		}
		return returnVal;
	} // end add

	// Calculation Function

	public static int[] payWith20(int[] owe) {
		int changeDue = (owe[0] * 100) + owe[1];
		int[] returnValue = new int[2];
		changeDue = 2000 - changeDue;
		returnValue[0] = changeDue / 100;
		returnValue[1] = changeDue % 100;
		return returnValue;
	}

}

// end moneyLab
