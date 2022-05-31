package day5;


import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
	
		int arr[] = {2,5,0,2,1,4,3,6,1,0};
		int n = 10;
		
		
		System.out.println("Enter the subarray Start point : ");
		int st = s1.nextInt();
		s1.nextLine();
		
		System.out.println("Enter the subarray End point : ");
		int et = s1.nextInt();
		s1.nextLine();
		
		System.out.println("Subarray : ");
		if(et <= n)
		{
			for(int i = st; i < et; i++)
			{
				System.out.println(arr[i]);
			}
		}
		else
		{
			System.out.println("End point is invalid");
		}
	}

}
