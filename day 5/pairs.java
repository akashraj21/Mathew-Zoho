import java.util.Scanner;

public class pairs {


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
		
		System.out.println("Enter target : ");
		int t = s1.nextInt();
		s1.nextLine();
		
		System.out.println("Pairs : ");
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if(arr[i] + arr[j] == t)
				{
					System.out.println(arr[i] + ", " + arr[j]);
				}
			}
		}
	}

}
