package fe;

import java.util.Scanner;

public class Fe2 {

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
		
		for(int i = 0; i < k; i++)
		{
			int temp = arr[n-1];
			for(int j = n-1; j > 0; j--)
			{
				arr[j] = arr[j - 1];
			}
			arr[0] = temp; 
			
			
		}

		System.out.println(arr[0]);
	}

}
