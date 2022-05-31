package test;

import java.util.ArrayList;
import java.util.HashSet;

public class q2 {

	
	public static void main(String[] args) {
		
		int len = 5;
		
		for(int i = 0; i < len; i++)
		{
			int j = len - 1 - i;
			for (int k = 0; k < len; k++)
			{
				if (k == i || k == j)
					System.out.print(i+1);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		
		
		
		
	}

}

