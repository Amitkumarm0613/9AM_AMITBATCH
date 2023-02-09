package pkg1;

public class Constructr1 
{
	public void m0()
	{
		this.m3();
		System.out.println("Default constructor");
	}
	public void m1()
	{
		System.out.println("One parameterized constructor");
	}
	public void m2()
	{
		System.out.println("Two parameterized constructor");
		this.m0();
		
	}
	public void m3()
	{
		System.out.println("Three parameterized constructor");
	}
	public void m4()
	{
		System.out.println("Four parameterized constructor");
	}

	public static void main(String[] args)
	{
		Constructr1 c1= new Constructr1();
		c1.m2();
		c1.m4();
        c1.m1();
        
	}

}
