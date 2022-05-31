package fe;

import java.util.HashSet;


public class Fe11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "";
		//String a = "bbadccdca";
		
		int n = a.length();
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i = 0; i < n; i++)
		{
			hs.add((int)a.charAt(i));
		}

		
		for(int x : hs)
		{
			int cnt = 0;
			for(int j = 0; j < n; j++)
			{
				
				if(x == (int)a.charAt(j))
				{
					cnt++;
				}
			}
			
			System.out.print((char)x + "" + cnt);
		}
		
		

	}

}
