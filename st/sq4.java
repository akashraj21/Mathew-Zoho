package st;

public class sq4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String a = "FIG";
		String ans = "";
		
		
		
		for(int i = 0; i < a.length(); i++)
		{
			int t = ((int) (a.charAt(i))) - 65;
			char b = (char) (90 - t);
			ans += b;
		}
		
		System.out.println(ans);

	}

}
