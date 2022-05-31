package day1;

interface p1{

	public void add(int a, int b);
}

interface p2{
	public void sub(int a, int b);
}

class Calculator implements p1,p2{
	
	public void mul(int a,int b){
		
		System.out.println("Mul : " + a*b);
	}

	public void add(int a, int b) {
		System.out.println("ADD : " + (a+b));
		
	}

	public void sub(int a, int b) {
		System.out.println("SUB : " + (a-b));
		
	}
}

public class Q{
	public static void main(String args[]){
		
		Calculator c = new Calculator();
		c.add(3, 5);
		c.sub(5, 2);
		c.mul(2, 2);
		
	}
}