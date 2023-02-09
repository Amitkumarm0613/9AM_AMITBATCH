package pkg1;

public class Constructr 
{
	public Constructr()
	{
		System.out.println("Default  constructor");
	}
	public Constructr(int x)
	{
		this();
		System.out.println("One parameterized constructor");
	}
	public Constructr(int y, int z)
	{
		System.out.println("Two parameterized constructor");
	}
	
	public static void main(String[] args)
	{
		Constructr c1=new Constructr(22);
		Constructr c2=new Constructr(22,52);

	}

}
