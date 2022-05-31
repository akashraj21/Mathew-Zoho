package evaluation;

import java.util.Scanner;

public class Qe1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		int r, c;
		
		int a1, a2;
		int b1, b2;
		
		System.out.println("Dimension of the Dungeon(Row X Column ) : ");
		r = s1.nextInt();
		s1.nextLine();
		
		c = s1.nextInt();
		s1.nextLine();
		
		System.out.println("Position of Adventurer : ");
		a1 = s1.nextInt();
		s1.nextLine();
		
		a2 = s1.nextInt();
		s1.nextLine();
		
		System.out.println("Position of gold : ");
		b1 = s1.nextInt();
		s1.nextLine();
		
		b2 = s1.nextInt();
		s1.nextLine();
		
		int d1, d2;
		
		if(a1 > b1)
		{
			d1 = a1 - b1;
		}
		else
		{
			d1 = b1 - a1;
		}
		
		if(a2 > b2)
		{
			d2 = a2 - b2;
			
		}
		else
		{
			d2 = b2 - a2;
		}

		
		System.out.println("Minimum Number of Steps : " + (d1+d2));
	}

}
