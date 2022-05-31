package evaluation;

import java.util.Scanner;

public class Qe3 {

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
		
		int p1,p2;
		
		System.out.println("Position of gold : ");
		int c1 = s1.nextInt();
		s1.nextLine();
		
		int c2 = s1.nextInt();
		s1.nextLine();
		
		int cnt = 0;
		
		int xarr[] = new int[10];
		int yarr[] = new int[10];
		int arrcnt = 0;
		
		int ini1 = a1;
		int ini2 = a2;
		
		while(a2 != c2)
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
					System.out.println("No possible Solution");
					System.exit(0);
				}
				
				cnt++;
				xarr[arrcnt] = a1;
				yarr[arrcnt] = a2;
				arrcnt++;
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
					System.out.println("No possible Solution");
					System.exit(0);
				}
				
				cnt++;
				xarr[arrcnt] = a1;
				yarr[arrcnt] = a2;
				arrcnt++;
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
					System.out.println("No possible Solution");
					System.exit(0);
				}
				cnt++;
				xarr[arrcnt] = a1;
				yarr[arrcnt] = a2;
				arrcnt++;
				
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
					System.out.println("No possible Solution");
					System.exit(0);
				}
				cnt++;
				xarr[arrcnt] = a1;
				yarr[arrcnt] = a2;
				arrcnt++;
			}
		}
		
		System.out.println("Minimum Number of Steps : " + cnt);
		
		System.out.print("Path : (" + ini1 + "," + ini2 + ") -> ");
		for(int i = 0; i < arrcnt; i++)
		{
			System.out.print("(" + xarr[i] + "," + yarr[i] + ") -> ");
		}

	}

}
