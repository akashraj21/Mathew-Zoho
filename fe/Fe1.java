package fe;

public class Fe1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String a = "bbab";
		//String a = "bbadccdca";
		
		int n = a.length();
		
		char l = 'a';
		
		for(int i = 0; i < n; i++)
		{
			if(a.charAt(i) > l)
			{
				l = a.charAt(i);
			}
		}
		
		for(int i = 97; i <= (int)l; i++)
		{
			int c = 0;
			for(int j = 0; j < n; j++)
			{
				if((int)a.charAt(j) == i)
				{
					c++;
				}
			}
			
			System.out.print((char)i + "" + c);
		
		}
		
	}

}
