package classObjectsAndMethods;

public class classConcept {
	//Access specifier class keyword class name
	
	
	//data members
	int x = 90;
	int y =100;

	public static void main(String[] args) {
		
	//create obj
		classConcept clsobj = new classConcept();
		
		//call methods
		clsobj.sum();
		
		//call data member
	System.out.println(clsobj.x);	
		
	System.out.println(clsobj.y);
	
	clsobj.sub(100, 40);


	}
	
	public void sum ()
	{
		int a=50;
		int b = 60;
		int sum = a+b;
		System.out.println(sum);
	}
	
	public void sub(int c,int d)
	{
		
		int sub = c-d;
		System.out.println(sub);

	}

}
