package day4;

abstract class cal{
	
	int num1;
	int num2;
	
	public abstract void add(int a, int b);
	
	public void sub(int a, int b){
		
		System.out.println("Sub : " + (a-b));
	}
	
}

class Cal2 extends cal{
	
	int num1;
	int num2;
	
	public void add(int a, int b)
	{
		System.out.println("Add : " + (a-b));
	}
	
	public void mul()
	{
		System.out.println("Mul : " + (num1*num2));
	}
	
}

public class Abst {
	public static void main(String args[]){
		
		Cal2 c = new Cal2();
		
		c.add(2,3);
		c.sub(3,2);
		c.mul();
	}
}
	
