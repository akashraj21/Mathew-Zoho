package exceptional;

public class A3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try{
			int arr[] = new int[10];
			array(arr);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	
	public static int array(int arr[]) throws Exception{
		
		arr[20] = 2;
		
		return 0;
		
	}
}
