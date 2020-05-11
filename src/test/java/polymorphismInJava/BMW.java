package polymorphismInJava;

public class BMW extends Car{
	
	@Override
	public void start() { // overridden method

		System.out.println("BMW ------Start");
	}

	
	public void theftSafty() {

		System.out.println("BMW ------theftSafty");
		
		/*String str = "100a";
		
		int num = Integer.valueOf(str);
		*/
	}

}
