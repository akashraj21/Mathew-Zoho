package day5_2;

public class a4 {

	
	public static void main(String[] args) {
		
		String a = "The Quick brown fox jumps over lazy dog";
		
		String b = "cat";
		
		String c = "fox";
		
		System.out.println(a.replaceAll(c, b));
		
		String aa = "Malayalam is good";
		
		String arr[] = aa.split(" ");
		
		for(String x : arr)
		{
			String t = ""; //
			
			for(int i = 0; i < x.length(); i++)
			{
				t = x.charAt(i) + t;
			}
			
			
			if(t.equalsIgnoreCase(x))
			{
				System.out.println(x + " -  is Palindrome");
			}
			else
			{
				System.out.println(x + " - is not at Palindrome");
			}
		}

	}

}
