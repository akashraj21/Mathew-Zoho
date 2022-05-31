package day5;

public class a10 {

	
	public static void main(String[] args) {
		
		
		int []nums1= { 1, 2, -2, 3, 4, 5, 6 };

		int []nums2 = { 1, 2, 3, 4, 5, 6 };

		int []nums3 = { 1, 2, -3, 4, 5, 6 };
		
		int flag = 0;
		for(int i = 0; i < nums3.length; i++)
		{
			int cnt = nums3[i];
			
			for(int j = i+1; j < nums3.length; j++)
			{
				cnt += nums3[j];
				if (cnt == 0)
				{
					flag = 1;
					break;
				}
			}
			
			if(flag == 1)
			{
				System.out.println("true");
				break;
			}
				
		}
		
		
		if(flag == 0)
		{
			System.out.println("False");
		}
		

	}

}
