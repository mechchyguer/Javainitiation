package Variables;

import javax.management.RuntimeErrorException;

public class Test_Mutex 
{

	//public static void main(String[] args) 		
		/*
		//Question 01  : Quelle sera la sortie console après l'éxécution de ce code?
		Integer a = new Integer (1);
		Integer b = new Integer (1);
		if ( a == b )
		System.out.println("a==b" );
		else
		System.out.println("a!=b" );*/
		
	/*
		// Question 02 :  Quelle sera la sortie console après l'éxécution de ce code?
		{
		Person p = new Person ("Henry");
		updatePersonne (p);
		System.out.println(p.getName());
		}
		
		public static void updatePersonne(Person p) 
				{ p = new Person ("John"); }
		
			private static class Person 
			
			{
				private String name;
		
				public Person (String name) 
					{super();
					this.name = name;}

				public String getName() {return name;}
		
			} */
	
	// Question 07 : Exercice MUTEX :
	
	public static void main(String[] args) 
	{
	try {
		System.out.println("A");
		testmethod();
		System.out.println("B");
		} catch (Exception e) 
		{System.out.println("C");}
		finally {System.out.println("D");}
	}
	private static void testmethod() 
	{
		throw new RuntimeException("Je suis une exception");
	}

}
