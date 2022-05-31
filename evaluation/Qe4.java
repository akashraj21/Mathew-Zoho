package evaluation;

import java.util.Scanner;

public class Qe4 {

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
		
		System.out.println("Position of Monster : ");
		b1 = s1.nextInt();
		s1.nextLine();
		
		b2 = s1.nextInt();
		s1.nextLine();
		
		System.out.println("Position of Trigger : ");
		int d1 = s1.nextInt();
		s1.nextLine();
		
		int d2 = s1.nextInt();
		s1.nextLine();
		
		
		System.out.println("Position of gold : ");
		int c1 = s1.nextInt();
		s1.nextLine();
		
		int c2 = s1.nextInt();
		s1.nextLine();
		
		int cnt = 0;
		int p1,p2;
		
		int flag = 0;
		
		while(a2 != c2 && flag == 0)
		{
			if(a2 < c2)
			{
				a2++;
				p1 = b1;
				p2 = b2;
				if(b2 < c2)
				{
					b2++;
				}
				else
				{
					b2--;
				}
				if(a1 == p1 && a2 == p2)
				{
					flag = 1;
				}
				
				cnt++;
				
			}
			else
			{
				a2--;
				p1 = b1;
				p2 = b2;
				if(b2 < c2)
				{
					b2++;
				}
				else
				{
					b2--;
				}
				if(a1 == p1 && a2 == p2)
				{
					flag = 1;
				}
				
				cnt++;
				
			}
			
			
		}
		
		while(a1 != c1)
		{
			if(a1 > c1)
			{
				a1--;
				p1 = b1;
				p2 = b2;
				if(b1 > c1)
				{
					b1--;
				}
				else
				{
					b1++;
				}
				if(a1 == p1 && a2 == p2)
				{
					flag = 1;
				}
				cnt++;
				
				
			}
			else
			{
				a1++;
				p1 = b1;
				p2 = b2;
				if(b1 > c1)
				{
					b1--;
				}
				else
				{
					b1++;
				}
				if(a1 == p1 && a2 == p2)
				{
					flag = 1;
				}
				cnt++;
				
			}
		
		}
		
		
		int pos1 = 0, pos2 = 0;
		
		if(flag == 1)
		{
			cnt = 0;
			if(a1 > d1)
			{
				pos1 = a1 - d1;
			}
			else
			{
				pos1 = d1 - a1;
			}
			
			if(a2 > d2)
			{
				pos2 = a2 - d2;
				
			}
			else
			{
				pos2 = d2 - a2;
			}
		}
		else
		{
			System.out.println("Minimum number of steps : " + cnt);
			System.exit(0);
		}
		
		cnt = pos1 + pos2;
	
		if(d1 > c1)
		{
			pos1 = d1 - c1;
		}
		else
		{
			pos1 = c1 - d1;
		}
		
		if(d2 > c2)
		{
			pos2 = d2 - c2;
			
		}
		else
		{
			pos2 = c2 - d2;
		}
		
		cnt+= pos1 + pos2;
		
		System.out.println("Minimum number of steps : " + cnt);
}
}
