package day5;

import java.util.Scanner;

public class a4 {

	
	public static void main(String[] args) {
		
		
Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter The number of elements : ");
		int n = s1.nextInt();
		s1.nextLine();
		
		int arr[] = new int[n];
		
		System.out.println("Enter The number : ");
		for(int i = 0; i < n; i++)
		{
			int a = s1.nextInt();
			s1.nextLine();
			arr[i] = a;
		}
		
		
		for(int i = 0; i< n-1 ; i++)
		{
			arr[i] = arr[i+1];
		}
		
		arr[n-1] = -1;
		
		for(int x:arr)
		{
			System.out.print(x + " ");
		}

	}

}
