package fe;

import java.util.Scanner;

public class Fe3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		int n = s1.nextInt();
		s1.nextLine();
		
		int arr[] = new int[n];
		
		int pos = 0;
		int neg = -1;
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = s1.nextInt();
			s1.nextLine();
			if(arr[i] > 0)
			{
				pos = pos + arr[i];
			}
			else if(arr[i] > neg)
			{
				neg = arr[i];
			}
		}
		
		if(pos > 0)
		{
			System.out.println(pos);
		}
		else
		{
			System.out.println(neg);
		}
		
		
		
		
		
	}

}
