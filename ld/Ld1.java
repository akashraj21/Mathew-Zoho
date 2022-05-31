package ld;

public class Ld1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//int arr1[] = {2};
		//int[] arr2 = {1,3};
		
		int arr1[] = {1,1,3};
		int[] arr2 = {2,2,1};
		
		//int arr1[] = {1,2};
		//int[] arr2 = {2,3};
		
		
		int temp = 0;
		int ans[] = new int[2];
		int totcnt = 0;
		
		for(int i = 0; i < arr1.length; i++)
		{
			totcnt += arr1[i];
		}
		
		for(int i = 0; i < arr2.length; i++)
		{
			totcnt += arr2[i];
		}
		
		int eq = totcnt / 2;
		
		
		for(int i = 0; i < arr1.length; i++)
		{
			int t = arr1[i];
			boolean flag = false;
			for(int j = 0; j < arr2.length; j++)
			{
				if((t + arr2[j]) == eq)
				{
					flag = true;
					ans[0] = t;
					temp = j;
				}
			}
			
			if(flag)
			{
				break;
			}
		}
		
		
		
		for(int i = 0; i < arr2.length; i++)
		{
			if(i != temp)
			{
				ans[1] = arr2[i];
				break;
			}
		}
		
		System.out.println("[" + ans[0] + "," + ans[1] + "]");
	}

}
