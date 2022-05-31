package test;


import java.util.*;

public class q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		
		int b[] = {100,100,100,100,90,100,100,100,100,100};
		
		int box = b.length;
		
		
		
		int tot = 0;
		
		for(int x : b)
		{
			tot+=x;
		}
		
		for(int i = 0; i < box; i++)
		{
			tot = tot - b[i];
			if(tot % 100 == 0)
			{
				System.out.println((i+1) + "th box");
				break;
			}
		}
		
		
		
		

	}

}
