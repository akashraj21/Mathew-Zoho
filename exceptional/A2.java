package exceptional;

public class A2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
			
			String a = null;
			int b = a.length();
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Program Ends here");
		}

	}

}
