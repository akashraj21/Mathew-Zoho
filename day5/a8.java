package day5;

public class a8 {

	
	public static void main(String[] args) {
		
		int arr[] = {3,7,11,8,2,9,1,2,6};
		int flag = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1 ;j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					flag = 1;
				}
				else
				{
					flag = 0;
					break;
				}
			}
			
			if (flag == 1)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
