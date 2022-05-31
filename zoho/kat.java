package zoho;

public class kat {

	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,4,5};
		
		int k = 5;
		
		
		int i = 0;
		
		for(i = 0; i < arr.length; i++)
		{
			if (arr[i] == k)
			{
				break;
			}
		}
		
		
		for(int j = 0; j <= i/2; j++)
		{
			int l = i - j;
			int temp = arr[j];
			arr[j] = arr[l];
			arr[l] = temp;
			
		}
		
		
		
		for(int x:arr)
		{
			System.out.println(x);
		}
	}

}
