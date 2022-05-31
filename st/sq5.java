package st;

public class sq5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String a = "255221220210";
		
		if(a.length() == 4)
		{
			System.out.println(a.charAt(0)+"."+a.charAt(1)+"." + a.charAt(2)+"." + a.charAt(3));
		}
		else if(a.length() > 12 )
		{
			System.out.println("No possible Solution");
		}
		else if(a.length() == 12)
		{
			int c = 0;
			for(int i = 0; i < 4;i++)
			{
				if(i != 0)
				{
					System.out.print(".");
				}
				String t = a.substring(c, (c+3));
				c += 3;
				System.out.print(t);
				
			}
		}
		
		
		

	}

}
