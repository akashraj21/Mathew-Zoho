import java.util.Scanner;

public class a2 {

	
	public static void main(String[] args) {
		
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the First String : ");
		String str1 = s1.nextLine();
		
		System.out.println("Enter the Second String : ");
		String str2 = s1.nextLine();
		
		if(str1.length() ==  str2.length())
		{
			System.out.println(str1.compareTo(str2));
		}
		else
		{
			System.out.println("Length are not equal.");
		}

	}

}
