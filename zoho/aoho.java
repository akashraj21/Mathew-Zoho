package zoho;

public class aoho {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String c = "tes124123yrd";
		
		String f = "123";
		int flag = 0;
		
		System.out.println(c.indexOf(f));
		
		for(int i = 0; i < c.length(); i++)
		{
			if(c.charAt(i) == f.charAt(0))
			{
				if((i+f.length()) <= c.length()){
				for(int j = 0; j < f.length(); j++)
				{
					
					if(c.charAt(i+j) == f.charAt(j))
					{
						flag = 1;
						continue;
					}
					else
					{
						flag = 0;
						break;
					}
				}
				}
			}
				if (flag == 1)
				{
					System.out.println(i);
					break;
				}
				
			}
		
		
		if (flag == 0)
		{
			System.out.println(-1);
		}
		
		
	}

}
