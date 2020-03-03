package Lab3;

public class Lab3 
{
	public static void main(String[] args)
	{
		float fahrenheit, c;
		fahrenheit = 98.6f;
		c = (5.0f/9) * (fahrenheit - 32);
		System.out.println("98.6 Farenheit is: " + c + " Centigrade");
		
		for(int i = 0; i <= 40; i += 5)
		{
			System.out.println(i + " Farenheit is: " + Centigrade(i) + " Centigrade");	
		}
		
		System.out.println(">>>WHILE LOOP<<<");
		
		int counter = 0;
		while(counter <= 40)
		{
			System.out.println(counter + " Farenheit is: " + Centigrade(counter) + " Centigrade");
			counter += 5;
		}
	}
	
	public static float Centigrade (float a)
	{
		return (5.0f/9.0f) * (a - 32.0f);
	}
}

/*
 * Data Types
 * byte			1 byte (8 bits)
 * short 		2 bytes
 * int 			4 bytes
 * long 		8 bytes
 * float 		4 bytes
 * double 		8 bytes
 */
