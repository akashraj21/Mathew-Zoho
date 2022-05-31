package zoho;

public class a2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String a = "WELCOMETOZOHOCORPORATION";
		
		for(int i = 0; i < a.length(); i++)
		{
			
			if(i > 0 && i % 5 == 0)
			{
				System.out.print("\n");
			}
			System.out.print(a.charAt(i) + "    ");
		}
	}

}
