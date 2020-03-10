
public class Lab14 {

	public static void main(String[] args) 
	{
		Money m1 = new Money();
		Money m2 = new Money(6,5);
		System.out.println(m1.getCents());
		System.out.println(m2.getDollars());
		System.out.println(m2);
		System.out.println(m1.compareTo(m2));
		System.out.println(m1.equals(m2));
		
		
		// LAB 15
		System.out.println("\nLab 15");
		Money m3 = new Money(5,243); 
		System.out.println(m3.toString());
		
		
		Money m4, m5;
		m4 = new Money(4,87);
		m5 = new Money(5,243);
		m4.Add(m5);
		System.out.println(m1.toString());
	}

}
