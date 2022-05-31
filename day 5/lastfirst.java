import java.util.Scanner;

public class lastfirst {

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
		
		for(int i = 0; i < n; i++)
		{
			for(int j = i; j < n; j++)
			{
				if(arr[i] > arr[j])
				{
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		
		System.out.println("sorted Array : ");
		for(int x : arr)
		{
			System.out.println(x);
		}
		
		System.out.println("Array ");
		for(int i = 0; i < n/2; i++)
		{
			int l = n - i - 1;
			System.out.print(" " + arr[l] + " " + arr[i]);
		}
		
		if(n%2 == 1)
		{
			System.out.print(" " + arr[n/2]);
		}
	}
	

}