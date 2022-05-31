package hotel_management_system;

 class Auth {
	
	 String user = "admin";
	 String pass = "pass";
	 String cusu = "customer";
	 String pasu = "1234";
	 
	 
	public int authCheck(String username, String password)
	{
		if(user.equals(username)){
			if (pass.equals(password))
			{
				System.out.println("Authentication Success");
				return 1;
			}
			else{
				System.out.println("Incorrect Password");
				return 0;
			}
		}
		else{
			System.out.println("Incorrect Username");
			return 0;
		}
		
	}
	
	public int cusCheck(String username, String password)
	{
		if(cusu.equals(username)){
			if (pasu.equals(password))
			{
				System.out.println("Authentication Success");
				return 1;
			}
			else{
				System.out.println("Incorrect Password");
				return 0;
			}
		}
		else{
			System.out.println("Incorrect Username");
			return 0;
		}
		
	}
	
	public int choice(String op)
	{
		if (op.equalsIgnoreCase("Y"))
		{
			return 1;
		}
		else if (op.equalsIgnoreCase("N"))
		{
			return 0;
		}
		else
		{
			return 2;
		}
	}
}
