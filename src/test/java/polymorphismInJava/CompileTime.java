package polymorphismInJava;

public class CompileTime {

	public static void main(String[] args) {
		
		//Method Overloading

		//can only be if and only if method have different signature
		 /* - Number of arguments - no of parameter
		  * - Type of arguments
		  * - Order of arguments*/
				
	}
	// number of argument
	
	public void add(int a, int b)
	{
		int sum = a=b;
		System.out.println(sum);
	}
	
	public void add(int x, int y , int z) //Duplicate method add(int, int) in type CompileTime 
	{
		int sum =x+y+y+z;
				System.out.println(sum);
	}

	// type of argument
	
	public void sub(double a, int b)
	{
		double sum = a=b; 
		//if add int and double result will be double
		// upcasting - internal typecasting int converted to double 
		System.out.println(sum);
	}
	
	public void sub(double x, double y) //Duplicate method add(int, int) in type CompileTime 
	{
		double sum =x+y;
				System.out.println(sum);
	}
	
	// // order of argument
	
	public void sub(String a, int b)
	{
		System.out.println("String is" + a + "and Integer is : " +b);
		
	}
	
	public void sub(int x, String y)
	{
		System.out.println("Integer is : " + x + "String is" + y );
	}
}
