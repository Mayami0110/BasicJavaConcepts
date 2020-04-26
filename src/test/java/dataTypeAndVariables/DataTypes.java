package dataTypeAndVariables;

public class DataTypes {

	public static void main(String[] args) {

		//Variable - Name of memory location to store values
	
		
		//Data Types
		
		//Primitive data types and Non Primitive data types
		
		//primitive data type : 						Non primitive
		//1. boolean - 1 byte 							1. String
		//2. byte	-	1 byte							2. Class
		//3. char -		2byte							3. Array
		//4. short - 	2 byte							4. Interface
		//5. int		4 byte
		//6. float		4 byte
		//7. long		8 byte
		//8. double		8 byte
		 
		boolean status = true;
		System.out.println(status);
		
		char a = 'M'; // M
		char b = 65;  //A based on unicode. Will give unicode values
		char c = 70 ; // F
		
		// byte range is -127 to 127
		byte marks = 89; 
		System.out.println(marks); // 89 
		
	//	byte money = 150; //Type mismatch: cannot convert from int to byte
		
		// short range is -32768 to 32768

		short mobileno = 500;
	//	short mobilenofull = 500000000; //Type mismatch: cannot convert from int to short
		
		// Because of memory we should use data type based on use
		
		int number= 10000;
	//	float num = 16.77; // Type mismatch: cannot convert from double to float 

		float num = (float) 16.77; //type caseting from double to float
		float num1 = 88.98f; 
		
		double dub = 100.56;
		
	//	int numb = 67.89; type caste from double to int 
		
		int numb = (int) 67.89; // from doubel to int // downcasting - from higher to lower data type 
		
	}

}
