import java.util.Scanner;

public class a10 {

	public static void main(String[] args) {
		
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the First String : ");
		String str1 = s1.nextLine();
		
		System.out.println("Enter the Second String : ");
		String str2 = s1.nextLine();
		
		if(str1.length() > str2.length())
		{
			int t = str1.length() - str2.length();
			
			System.out.println(str1.substring(t) + str2);
		}
		else
		{
			int t = str2.length() - str1.length();
			
			System.out.println(str1 + str2.substring(t));
			
		}
		
		

	}

}