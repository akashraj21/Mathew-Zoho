
public class child {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String arr[][] = {{"luke", "shaw"}, {"wayne", "rooney"}, {"rooney", "ronaldo"}, {"shaw", "rooney"}};

	
		String son = "";
		for(int i = 0; i < 4; i++)
		{
			if(arr[i][1].equals("ronaldo"))
			{
				son = arr[i][0];
				break;
			}
		}
		
		int grandson = 0;
		for(int i = 0; i < 4; i++)
		{
			if(arr[i][1].equals(son))
			{
				grandson++;
			}
		}
		
		System.out.println(grandson);
		
		
	}

}
