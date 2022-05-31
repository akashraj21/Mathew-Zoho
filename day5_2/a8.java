package day5_2;

import java.util.*;

public class a8 {

	
	public static void main(String[] args) {
		
		int arr[] = {2,5,0,2,1,4,3,6,1,0};
		int num = arr.length;
		int[] res = new int[2];
		
		boolean flag = false;
		
		for(int i = 0; i < num; i++)
		{
			for(int j =i+1 ;j < num; j++)
			{
				if(issubarray(i,j,arr))
				{
					flag = true;
					if((j-i+1) > (res[1] - res[0] + 1))
					{
						res[0] = i;
						res[1] = j;
					}
					
				}
			}
			
		}
		
		if(flag)
		{
			System.out.println("The Largest sub-array is :  ["+res[0]+ "," + res[1]+"]");
			System.out.println("Elements of the sub - array : ");
			for(int i = res[0]; i <= res[1]; i++)
			System.out.println(arr[i] + " ");
		}
		

	
	}

	static boolean issubarray(int i, int j, int[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int min = arr[i], max = arr[i];
		
		for(int k = i; k <= j; k++)
		{
			if(hs.contains(arr[k]))
				return false;
			else
			{
				min = min<arr[k]?min:arr[k];
				max = max>arr[k]?max:arr[k];
				hs.add(arr[k]);
			}
		}
		
		if((max-min+1) == j-i+1)
		{
			return true;
		}		
		
		return false;
	}

}
