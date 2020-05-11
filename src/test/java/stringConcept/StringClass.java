package stringConcept;

public class StringClass {

	public static void main(String[] args) {
		
		
		//1. What is string
		//String is a class belongs to java.lang.String
		//in built method for operations
		
//		String Class inherit Object class
	
		String str = "Selenium is used for automation app";
		
		// in-built method:
		
		//startwith - return boolean i.e true or false
		
		boolean status1 = str.startsWith("Selenium");
		System.out.println(status1);
		
		//endwith - return boolean i.e true or false
		boolean status2 = str.endsWith("Selenium");
		System.out.println(status2);
		
		//equals and equalignorecase return boolean
		String actual = "Welcome to Selenium";
		String expected = "Welcome to Selenium";
		
		System.out.println(actual.equals(expected));
		System.out.println(actual.equalsIgnoreCase(expected));
		
		//contains - return true or false boolean
		
		String fullstring = "Welcome to Selenium Web";
		String containcheck = "Selenium";
		
		System.out.println(fullstring.contains(containcheck));
		
		//Split - break the string based on regular exp.
		// it will return array
		 
		String strSplit = "Selenium-QTP-HP-JMETER";
		
		String[] splitedstr =strSplit.split("-"); // we can print with loop
		
		for(int i=0;i<splitedstr.length;i++)
		{
			System.out.println(i +"." +" "+splitedstr[i]);
		}
		
		//trim - remove the white space before and after
		//it will not trim in middle only before and after
		
		String trimstr = "   Name is Mayank     ";
		System.out.println(trimstr.trim());
		
		//charAt - it will return char at certain place
		
		String charString = "My Name is Mayank";
		
		System.out.println(charString.charAt(4)); // always starts wiht 0 index;

		
		
	}

}
