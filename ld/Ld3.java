package ld;

public class Ld3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		char arr[] = {'c' ,'f', 'j'};
		char target = 'a';
		
		
		for(int i = 0; i < arr.length; i++)
		{
			if(target < arr[i])
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
