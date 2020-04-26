package conditionalStatementConcepts;

public class cIfelseifStatement {

	public static void main(String[] args) {

		String browser = "Firefox";
		if (browser.equalsIgnoreCase("FF")) {
			System.out.println("My browser in first if : " + browser);
		}

		else if (browser.equalsIgnoreCase("IE")) {
			System.out.println("My browser in second with else if : " + browser);
		}

		else {
			System.out.println("My browser in second with else i.e anyother  : " + browser);
		}
	}

}
