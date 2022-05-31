package day1;
import java.util.*;

public class Swap {

	public static void main(String[] args) {
		
		int a, b;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Num1 : ");
		a = s.nextInt();
		
		System.out.print("Enter Num2 : ");
		b = s.nextInt();
		
		
		System.out.println("Before Swap : ");
		System.out.println("A : " + a);
		System.out.println("B : " + b);		
		
		Swap s1 = new Swap();
		s1.swap(a, b);
	}
	
	public void swap(int a, int b)
	{
		int temp;
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swap : ");
		System.out.println("A : " + a);
		System.out.println("B : " + b);	
		
	}

}
