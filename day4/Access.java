package day4;

public class Access
{
	public static void main(String args[])
	{
		
		private_ p = new private_();
		System.out.println(p.dob);
		System.out.println(p.sal);
		
		p.print();
		
	}
}


class private_{
	
	private String Name = "Mathew";
	public int dob = 23;
	protected int sal = 2000;
	
	public void print()
	{
		System.out.println(Name);
		System.out.println(dob);
		System.out.println(sal);
	}
}

