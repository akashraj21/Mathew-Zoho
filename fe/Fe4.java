package fe;

import java.util.Scanner;

public class Fe4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		int n = s1.nextInt();
		s1.nextLine();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = s1.nextInt();
			s1.nextLine();
		}
		
		int k = s1.nextInt();
		s1.nextLine();
		
		boolean flag = true;
		
		for(int i = 0; i < n;i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if(i > j & (arr[i] - arr[j]) == k)
				{
					System.out.println("True");
					System.exit(0);
				}
				else if(j > i && (arr[j] - arr[i] == k))
				{
					System.out.println("True");
					System.exit(0);
				}
			}
		}
		
		if(flag)
		{
			System.out.println("False");
		}

	}

}
