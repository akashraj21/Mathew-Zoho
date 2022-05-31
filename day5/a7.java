package day5;

public class a7 {

	
	public static void main(String[] args) {
		
		int arr1[] = {3,7,11,8,2,9,1,2,6};
		char arr2[] = {'f', 'w', 'g', 'z', 'A', 'p', 'q'};
		
		for(int i = 0; i < arr1.length; i++)
		{
			for(int j = i+1; j < arr1.length; j++)
			{
				if(arr1[i] > arr1[j])
				{
					int t = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = t;
				}
			}
			
		}
		
		System.out.println("Sorted int Array : ");
		for(int x : arr1)
		{
			System.out.print(x + ", ");
		}
		
		for(int i = 0; i < arr2.length; i++)
		{
			for(int j = i+1; j < arr2.length; j++)
			{
				if(arr2[i] > arr2[j])
				{
					char t = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = t;
				}
			}
			
		}
		
		System.out.println("\nSorted Char Array : ");
		for(char x:arr2)
		{
			System.out.print(x + ",");
		}
		

	}

}
