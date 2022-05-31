package day1;
import java.util.*;

public class Multi {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int m;
		System.out.print("Enter the Table Number : ");
		m = s.nextInt();
		
		System.out.println();
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(m + " * " + i + " = " + (m*i));
		}

	}

}
