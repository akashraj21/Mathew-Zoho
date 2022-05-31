public class a5 {

	
	public static void main(String[] args) {
		
		String a = "BOOKKEEBPER";
		
		int flag = 0;
		
		for(int i = 0; i < a.length(); i++)
		{
			for(int j = 0; j < a.length(); j++)
			{
				if(i != j && a.charAt(i) == a.charAt(j))
				{
					flag = 1;
					break;
				}
					
			}
			
			if (flag == 0)
			{
				System.out.println("First non Repeating char : " + a.charAt(i));
				break;
			}
			flag = 0;
		}

	}

}
