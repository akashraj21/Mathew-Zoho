package day5;

public class subarr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int nums[] = { 2, 5, 0, 2, 1, 4, 3, 6, 1, 0 };
		
		int arr[][] = new int[10][10];
		int acnt = 0;
		
		for(int i = 0; i < nums.length; i++)
		{
			int temp[] = new int[10];
			int cnt = 0;
			temp[cnt] = nums[i];
			cnt++;
			
			for(int j = i; j < nums.length; j++)
			{
				
				for(int k = 0; k < temp.length; k++)
				{
					if(nums[j] == temp[k])
					{
						arr[acnt] = temp.clone();
						break;
					}
				}
				
				temp[cnt] = nums[j];
				
			}
		}
		
		for(int x[]: arr)
		{
			for(int y : x)
			{
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
	}

}
