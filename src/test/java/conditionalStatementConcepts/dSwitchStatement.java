package conditionalStatementConcepts;

public class dSwitchStatement {

	public static void main(String[] args) {

		// switch statement : it allow to match with multiple cases

		/*
		 * switch(expressions) {
		 * 
		 * case value : code here first case 
		 * break;
		 * 
		 * case value2 : code here second 
		 * break;
		 * 
		 * // for any =other case we should have this 
		 * default:
		 * 
		 * 
		 * }
		 */
		
		//Data type should be same for comparison
		// we can have multiple case
		//We can only use int,strings and enum for comparison
		//Break is opt but if not provided it will execute all
		//default is opt .if not match it will come out of statement
		
		int x = 3;
		switch(x)
		{
		case 1:
			System.out.println("Poor performance");
			break;
		case 2:
			System.out.println("Slow performance");
			break;
		case 3:
			System.out.println("Avg performance");
			break;
		case 4:
			System.out.println("Excelent  performance");
			break;
		case 5:
			System.out.println("Outstanding performance");
			break;
			default:
				System.out.println("Not matching anything");
		}

	}

}
