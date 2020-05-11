package polymorphismInJava;

public class TestCar {

	public static void main(String[] args) {
		
	//when same methods are there in parent and child class with same name and 
		//same no of arguments is called method overriding	
	
		
		// static polymorphism  -- compile time polymorphism
		BMW bmw = new BMW();
		bmw.start(); //child class
		bmw.stop();  //base class
		bmw.refule(); //base class
		bmw.theftSafty(); //child class
		
	System.out.println("========================");
		
		Car car = new Car();
		car.start();
		car.stop();
		car.refule();
		// car.thefsafty ---- error 

		System.out.println("========================");

		// top casting
		
		Car carbmw = new BMW(); // Child class object can be refered by parent class reference variable -- 
		// dynamic ploymorphism or runtime polymorphism 
		
		carbmw.start();
		carbmw.stop();
		carbmw.refule();
		// carbmw.theftSafty --  error 
	
		
		// downcasting
		BMW bmwcar = (BMW) new Car();
		bmwcar.start(); // java.lang.ClassCastException: polymorphismInJava.Car cannot be cast to polymorphismInJava.BMW
		
		

	}

}
