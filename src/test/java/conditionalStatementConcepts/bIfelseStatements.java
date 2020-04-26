package conditionalStatementConcepts;

public class bIfelseStatements {

	public static void main(String[] args) {

		// if condition is true execute if block or else block

		/*
		 * if(conditions) { sum code } else { else code }
		 */

		String browser = "FF";

		if (browser.equalsIgnoreCase("FF")) {
			System.out.println("My browser is in if : " + browser);

		}

		else {

			System.out.println("My browser is in else : " + browser);

		}
	}
}
