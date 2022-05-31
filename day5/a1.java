package day5;

import java.util.Scanner;

public class a1 {

	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
	
		System.out.println("Enter the Order of matrix (row): ");
		int row = s1.nextInt();
		s1.nextLine();
		
		System.out.println("Enter the Order of matrix (Column): ");
		int col = s1.nextInt();
		s1.nextLine();
		
		
		int arr1[][] = new int[row][col]; 
		int arr2[][] = new int[row][col];
		int arr3[][] = new int[row][col];
		
		
		
		System.out.println("Enter the values of Matrix 1 :");
		for(int i = 0; i < row; i++)
		{
			
			for(int j = 0; j < col; j++)
			{
				int a = s1.nextInt();
				s1.nextLine();
				arr1[i][j] = a;
				
			}
		}
		
		System.out.println("Enter the values of Matrix 2 :");
		for(int i = 0; i < row; i++)
		{
			
			for(int j = 0; j < col; j++)
			{
				int a = s1.nextInt();
				s1.nextLine();
				arr2[i][j] = a;
				
			}
		}
		
		System.out.println("The Addition of two matrix are  : ");
		for(int i = 0; i < row; i++)
		{
			
			for(int j = 0; j < col; j++)
			{
				arr3[i][j] = arr1[i][j] + arr2[i][j];
				
			}
		}
		
		for(int x[] : arr3)
		{
			for(int y : x)
			{
				System.out.println(y);
			}
		}
		
	}

}
