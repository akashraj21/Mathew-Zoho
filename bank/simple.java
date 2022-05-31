import java.util.*;

public class simple{
	
	static int bal = 25000;
	static String name = "Mathew";
	static String acc = "1020304050";
	static String bankName = "ABC Bank";
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args){
		
		String username;
		String password;
		String u = "admin";
		String p = "pass";
		int flag = 0;
		
		do
		{
		System.out.println("Enter Username : ");
		username = s.nextLine();
		
		System.out.println("Enter Password : ");
		password = s.nextLine();
		
		if (username.equals(u) && password.equals(p))
		{
			flag = 1;
		}
		else
		{
			System.out.println("Invalid Login");
		}
		}
		while(flag != 1);
		
		
		if(flag == 1){
		int ch = 0;
		do{
			System.out.println("Banking System");
			System.out.println("1. Check Balance");
			System.out.println("2. Account Details");
			System.out.println("3. Withdraw");
			System.out.println("4. Deposit");
			System.out.println("5. Offers");
			System.out.println("6. Exit");
			ch = s.nextInt();
			switch(ch)
			{
				case 1 :
				{
					balance();
					break;
				}
				case 2 :
				{
					account();
					break;
			
				}
				case 3 :
				{
					withdraw();
					break;
				}
				case 4 :
				{
					deposit();
					break;
				}
				case 5:
				{
					offers();
					break;
				}
				case 6 : 
				{
					System.out.println("Thank You");
					break;
				}
				default :
				{
					System.out.println("Invalid Input");
					break;
				}
			}
		}
		while(ch != 6);

	}
	}
	
	static void balance()
	{
		System.out.println("Curent Balance : " + bal);
		
	}
	
	static void account()
	{
		System.out.println(bankName);
		System.out.println("Account No : " + acc);
		System.out.println("Account Holder Name : " + name);
		System.out.println("Account Balance : " + bal);
	}
	static void withdraw()
	{
		balance();
		System.out.println("Enter the amount to Withdraw : ");
		int w = s.nextInt();
		
		if (w < bal){
			bal-=w;
		}else{
			System.out.println("Insufficient Fund");
		}
		
		balance();
	}
	
	static void deposit()
	{
		System.out.println("Enter the amount to Deposit : ");
		int w = s.nextInt();
		
		bal+=w;
		
		balance();
	}
	
	static void offers()
	{
		System.out.println("Offers For You");
		String arr[] = {"10 % off on oneplus", "15 % off on iphones", "10 % off on Amazon"};
		
		for(String x : arr)
		{
			System.out.println(x);
		}
	}
}