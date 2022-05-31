package zoho;

public class Qwert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String a = "1223";
		
		
		int n = a.length();
		
		int count = 1;
		
		for(int i = 0; i < n-1; i++)
		{
			int t = Character.getNumericValue(a.charAt(i));
			if( t == 1 ) 
			{
				t = 10 + Character.getNumericValue(a.charAt(i+1));
				if (t < 26)
				{
					count++;
				}
			}
			else if(t == 2)
			{
				t = 20 + Character.getNumericValue(a.charAt(i+1));
				if (t < 26)
				{
					count++;
				}
			}
		}
		
		System.out.println(count);
		
			
		

	}

}
