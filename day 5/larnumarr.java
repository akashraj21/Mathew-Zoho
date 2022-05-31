public class larnumarr {

	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,0,4,6};
		
		for (int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				if(arr[i] < arr[j]){
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		
		System.out.println("Largest Num using array : ");
		for(int x : arr)
		{
			System.out.print(x);
		}
	}

}
